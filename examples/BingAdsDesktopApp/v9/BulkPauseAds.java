package com.microsoft.bingads.examples.v9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.bulk.entities.*;
import com.microsoft.bingads.bulk.*;
import com.microsoft.bingads.bulk.AdApiError;
import com.microsoft.bingads.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.bulk.BatchError;
import com.microsoft.bingads.bulk.OperationError;
import com.microsoft.bingads.campaignmanagement.*;

public class BulkPauseAds extends BulkExampleBaseV9 {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
     
    final static long campaignIdKey = -123; 
    final static long adGroupIdKey = -1234; 
        
    public static void main(String[] args) {
		
		BulkEntityIterable entities = null;
				
		try {
			authorizationData = new AuthorizationData();
			authorizationData.setDeveloperToken(DeveloperToken);
			authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
			authorizationData.setCustomerId(CustomerId);
			authorizationData.setAccountId(AccountId);
						            				
			// Take advantage of the BulkServiceManager class to efficiently manage ads and keywords for all campaigns in an account. 
			// The client library provides classes to accelerate productivity for downloading and uploading entities. 
			// For example the UploadEntitiesAsync method of the BulkServiceManager class submits your upload request to the bulk service, 
			// polls the service until the upload completed, downloads the result file to a temporary directory, and exposes BulkEntity-derived objects  
			// that contain close representations of the corresponding Campaign Management data objects and value sets.
			    
			BulkService = new BulkServiceManager(authorizationData);
			
			// Poll for downloads at reasonable intervals. You know your data better than anyone. 
			// If you download an account that is well less than one million keywords, consider polling 
			// at 15 to 20 second intervals. If the account contains about one million keywords, consider polling 
			// at one minute intervals after waiting five minutes. For accounts with about four million keywords, 
			// consider polling at one minute intervals after waiting 10 minutes. 
			
			BulkService.setStatusPollIntervalInMilliseconds(5000);
						
			// Complete a full download of all ad groups in the account. 
			 
			List<BulkDownloadEntity> downloadEntities = new ArrayList<BulkDownloadEntity>();
			downloadEntities.add(BulkDownloadEntity.ADS);
			
			DownloadParameters downloadParameters = new DownloadParameters();
			downloadParameters.setEntities(downloadEntities);
			downloadParameters.setFileType(DownloadFileType.CSV);
			
			outputStatusMessage("Starting DownloadEntitiesAsync . . .\n"); 
			entities = BulkService.downloadEntitiesAsync(downloadParameters, null, null).get();
			
			List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
			
			outputStatusMessage("Printing the results of DownloadEntitiesAsync . . .\n"); 
			for (BulkEntity entity : entities) {
				if (entity instanceof BulkTextAd 
						&& ((BulkTextAd)entity).getAd().getStatus() == AdStatus.ACTIVE) {
					outputBulkTextAds(Arrays.asList((BulkTextAd) entity) );
					((BulkTextAd)entity).getAd().setStatus(AdStatus.PAUSED);
					uploadEntities.add(entity);
				}
			}
			entities.close();
			
			if (!uploadEntities.isEmpty()){
				outputStatusMessage("Changed local status of all Active text ads to Paused. Ready for upload.\n"); 
				
				EntityUploadParameters entityUploadParameters = new EntityUploadParameters();
				entityUploadParameters.setEntities(uploadEntities);
				entityUploadParameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
				
				// UploadEntitiesAsync will upload the entities you prepared and will download the results file 
				// Alternative is to write to file and then upload the file. Use UploadFileAsync for large uploads.
				
				outputStatusMessage("Starting UploadEntitiesAsync . . .\n"); 
				
				// Wait here and assign the upload results to 'entities'
				entities = BulkService.uploadEntitiesAsync(entityUploadParameters, null, null).get();

				outputStatusMessage("Printing the results of UploadEntitiesAsync . . .\n"); 
				for (BulkEntity entity : entities) {
					if (entity instanceof BulkTextAd) {
						outputBulkTextAds(Arrays.asList((BulkTextAd) entity) );
					}
				}
				entities.close();
			}
			else{
				outputStatusMessage("All text ads are already Paused. \n"); 
			}
			
			outputStatusMessage("Program execution completed\n"); 
			
		} catch (ExecutionException ee) {
			Throwable cause = ee.getCause();
			if (cause instanceof AdApiFaultDetail_Exception) {
				AdApiFaultDetail_Exception ex = (AdApiFaultDetail_Exception)cause;
				System.out.println("The operation failed with the following faults:\n");
				
				for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
				{
					System.out.printf("AdApiError\n");
					System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
				}
			} else if (cause instanceof ApiFaultDetail_Exception) {
				ApiFaultDetail_Exception ex = (ApiFaultDetail_Exception)cause;
				System.out.println("The operation failed with the following faults:\n");
				
				for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
				{
					System.out.printf("BatchError at Index: %d\n", error.getIndex());
					System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
				}
				
				for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
				{
					System.out.printf("OperationError\n");
					System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
				}
			} else {
				ee.printStackTrace();	
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} finally {
			if (entities != null){
				try {
					entities.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	
		System.exit(0);
	}
}