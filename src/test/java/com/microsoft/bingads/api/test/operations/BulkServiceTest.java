package com.microsoft.bingads.api.test.operations;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.bulk.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.bulk.BulkDownloadEntity;
import com.microsoft.bingads.bulk.BulkDownloadOperation;
import com.microsoft.bingads.bulk.BulkEntityIterable;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.CampaignScope;
import com.microsoft.bingads.bulk.DataScope;
import com.microsoft.bingads.bulk.DownloadCampaignsByAccountIdsRequest;
import com.microsoft.bingads.bulk.DownloadCampaignsByAccountIdsResponse;
import com.microsoft.bingads.bulk.DownloadCampaignsByCampaignIdsRequest;
import com.microsoft.bingads.bulk.DownloadCampaignsByCampaignIdsResponse;
import com.microsoft.bingads.bulk.DownloadFileType;
import com.microsoft.bingads.bulk.DownloadParameters;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusRequest;
import com.microsoft.bingads.bulk.GetDetailedBulkDownloadStatusResponse;
import com.microsoft.bingads.bulk.PerformanceStatsDateRange;
import com.microsoft.bingads.bulk.ResultFileType;
import com.microsoft.bingads.bulk.SubmitDownloadParameters;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.internal.utilities.BulkFileReaderFactory;
import com.microsoft.bingads.internal.utilities.ZipExtractor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.ExecutionException;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BulkServiceTest extends FakeApiTest {
    
    @Test
    public void BulkService_SubmitDownload_AccountLevel_CallsApiAndReturnsCorrectOperation() throws InterruptedException, ExecutionException {
        final DownloadCampaignsByAccountIdsResponse apiResponse = new DownloadCampaignsByAccountIdsResponse();
        apiResponse.setDownloadRequestId("req456");        
        
        FakeBulkService.setGetDownloadCampaignsByAccountIdsResponse(new Supplier<DownloadCampaignsByAccountIdsResponse>() {            
            @Override
            public DownloadCampaignsByAccountIdsResponse get() {
                return apiResponse;
            }
        });
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());
        
        final AuthorizationData authorizationData = createUserData();
        
        final SubmitDownloadParameters parameters = new SubmitDownloadParameters();
        
        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.getDataScope().add(DataScope.ENTITY_PERFORMANCE_DATA);                  

        parameters.setEntities(new ArrayList<BulkDownloadEntity>());
        Collection<BulkDownloadEntity> entities = parameters.getEntities();
        entities.add(BulkDownloadEntity.CAMPAIGNS);
        entities.add(BulkDownloadEntity.KEYWORDS);
 
        parameters.setPerformanceStatsDateRange(new PerformanceStatsDateRange());
        parameters.setLastSyncTimeInUTC(new GregorianCalendar(2014, 1, 2));

        FakeBulkService.setOnDownloadCampaignsByAccountIdsRequest(new Consumer<DownloadCampaignsByAccountIdsRequest>() {

            @Override
            public void accept(DownloadCampaignsByAccountIdsRequest request) {
                assertEquals((Long)authorizationData.getAccountId(), request.getAccountIds().getLongs().get(0));
                assertEquals(parameters.getDataScope(), request.getDataScope());
                assertEquals(parameters.getEntities(), request.getEntities());
                assertEquals(parameters.getPerformanceStatsDateRange(), request.getPerformanceStatsDateRange());
                assertEquals(parameters.getLastSyncTimeInUTC(), request.getLastSyncTimeInUTC());
            }
        });
        
        BulkServiceManager bulkServiceManager = new BulkServiceManager(authorizationData);


        BulkDownloadOperation operation = bulkServiceManager.submitDownloadAsync(parameters, null).get();                        
        
        assertEquals("track123", operation.getTrackingId());
        assertEquals("req456", operation.getRequestId());       
    }

    @Test
    public void BulkService_SubmitDownload_CampaignLevel_CallsApiAndReturnsCorrectOperation() throws InterruptedException, ExecutionException {
        final DownloadCampaignsByCampaignIdsResponse apiResponse = new DownloadCampaignsByCampaignIdsResponse();
        apiResponse.setDownloadRequestId("req456");        
        
        FakeBulkService.setGetDownloadCampaignsByCampaignIdsResponse(new Supplier<DownloadCampaignsByCampaignIdsResponse>() {            
            @Override
            public DownloadCampaignsByCampaignIdsResponse get() {
                return apiResponse;
            }
        });
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());      
        
        final AuthorizationData authorizationData = createUserData();
        
        final SubmitDownloadParameters parameters = new SubmitDownloadParameters();
                
        List<Long> campaignIds = new ArrayList<Long>();
        campaignIds.add(1L);
        campaignIds.add(10L);
        campaignIds.add(20L);
        parameters.setCampaignIds(campaignIds);

        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.getDataScope().add(DataScope.ENTITY_PERFORMANCE_DATA);   

        parameters.setEntities(new ArrayList<BulkDownloadEntity>());
        Collection<BulkDownloadEntity> entities = parameters.getEntities();
        entities.add(BulkDownloadEntity.CAMPAIGNS);
        entities.add(BulkDownloadEntity.KEYWORDS);

        GregorianCalendar calendar = new GregorianCalendar(2014, 1, 2);        

        parameters.setPerformanceStatsDateRange(new PerformanceStatsDateRange());
        parameters.setLastSyncTimeInUTC(calendar);

        FakeBulkService.setOnDownloadCampaignsByCampaignIdsRequest(new Consumer<DownloadCampaignsByCampaignIdsRequest>() {

            @Override
            public void accept(DownloadCampaignsByCampaignIdsRequest request) {
                for (Integer i = 0; i < request.getCampaigns().getCampaignScopes().size(); i++) {
                    Long expectedId = parameters.getCampaignIds().get(i);
                    
                    CampaignScope campaignScope = request.getCampaigns().getCampaignScopes().get(i);
                    
                    assertEquals((Long)123L, campaignScope.getParentAccountId());
                    assertEquals(expectedId, campaignScope.getCampaignId());
                }
                                
                assertEquals(parameters.getDataScope(), request.getDataScope());
                assertEquals(parameters.getEntities(), request.getEntities());
                assertEquals(parameters.getPerformanceStatsDateRange(), request.getPerformanceStatsDateRange());
                assertEquals(parameters.getLastSyncTimeInUTC(), request.getLastSyncTimeInUTC());
            }
        });
        
        BulkServiceManager bulkServiceManager = new BulkServiceManager(authorizationData);

        BulkDownloadOperation operation = bulkServiceManager.submitDownloadAsync(parameters, null).get();                        
        
        assertEquals("track123", operation.getTrackingId());
        assertEquals("req456", operation.getRequestId());  
    }

    @Test
    public void BulkService_DownloadFile_CallsApiDownloadsAndExtractsFile() throws FileNotFoundException, UnsupportedEncodingException, IOException, URISyntaxException, InterruptedException, ExecutionException {
        final DownloadCampaignsByAccountIdsResponse apiResponse = new DownloadCampaignsByAccountIdsResponse();
        apiResponse.setDownloadRequestId("req456");        
        
        FakeBulkService.setGetDownloadCampaignsByAccountIdsResponse(new Supplier<DownloadCampaignsByAccountIdsResponse>() {            
            @Override
            public DownloadCampaignsByAccountIdsResponse get() {
                return apiResponse;
            }
        });        
                
        FakeBulkService.setOnGetDetailedBulkDownloadStatus(new Consumer<GetDetailedBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetDetailedBulkDownloadStatusRequest t) {
                assertEquals("req456", t.getRequestId());
            }
        });
        
        FakeBulkService.setGetDetailedBulkDownloadStatusResponse(new Supplier<GetDetailedBulkDownloadStatusResponse>() {
            @Override
            public GetDetailedBulkDownloadStatusResponse get() {
                GetDetailedBulkDownloadStatusResponse statusResponse = new GetDetailedBulkDownloadStatusResponse();
                statusResponse.setPercentComplete(100);
                statusResponse.setRequestStatus("Completed");
                statusResponse.setResultFileUrl("http://download.com/123");
                statusResponse.setForwardCompatibilityMap(new ArrayOfKeyValuePairOfstringstring());
                
                return statusResponse;
            }
        });   
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());
        
        final AuthorizationData authorizationData = createUserData();
        
        final DownloadParameters parameters = new DownloadParameters();        
        
        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.getDataScope().add(DataScope.ENTITY_PERFORMANCE_DATA);                  

        parameters.setEntities(new ArrayList<BulkDownloadEntity>());
        Collection<BulkDownloadEntity> entities = parameters.getEntities();
        entities.add(BulkDownloadEntity.CAMPAIGNS);
        entities.add(BulkDownloadEntity.KEYWORDS);
 
        parameters.setPerformanceStatsDateRange(new PerformanceStatsDateRange());
        parameters.setLastSyncTimeInUTC(new GregorianCalendar(2014, 1, 2));

        FakeBulkService.setOnDownloadCampaignsByAccountIdsRequest(new Consumer<DownloadCampaignsByAccountIdsRequest>() {
            @Override
            public void accept(DownloadCampaignsByAccountIdsRequest request) {
                assertEquals((Long)authorizationData.getAccountId(), request.getAccountIds().getLongs().get(0));
                assertEquals(parameters.getDataScope(), request.getDataScope());
                assertEquals(parameters.getEntities(), request.getEntities());
                assertEquals(parameters.getPerformanceStatsDateRange(), request.getPerformanceStatsDateRange());
                assertEquals(parameters.getLastSyncTimeInUTC(), request.getLastSyncTimeInUTC());
            }
        });                   
        
        FakeHttpFileService httpFileService = new FakeHttpFileService();

        httpFileService.setOnDownloadFile(new BiConsumer<String, File>() {
            @Override
            public void accept(String url, File file) {
                assertEquals("http://download.com/123", url);
            }
        });
        
        ZipExtractor zipExtractor = createMock(ZipExtractor.class);
          
        File expectedZipFile = new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK\\req456.zip");
        
        File expectedResultFile = new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK\\req456");
        
        expect(zipExtractor.extractFirstEntryToFile(expectedZipFile, expectedResultFile, true, false)).andReturn(new File("file path"));
        
        replay(zipExtractor);

        BulkServiceManager bulkServiceManager = new BulkServiceManager(authorizationData);
        
        bulkServiceManager.setHttpFileService(httpFileService);
        bulkServiceManager.setZipExtractor(zipExtractor);

        File file = bulkServiceManager.downloadFileAsync(parameters, null).get();                
        
        verify(zipExtractor);
        
        assertEquals(new File("file path"), file);
        assertTrue(httpFileService.getDownloadWasCalled());
    }   

    @Test
    public void BulkService_DownloadEntities_CallsApiDownloadsAndExtractsFile_Async() throws IOException, InterruptedException, ExecutionException {
        final DownloadCampaignsByAccountIdsResponse apiResponse = new DownloadCampaignsByAccountIdsResponse();
        apiResponse.setDownloadRequestId("req456");        
        
        FakeBulkService.setGetDownloadCampaignsByAccountIdsResponse(new Supplier<DownloadCampaignsByAccountIdsResponse>() {            
            @Override
            public DownloadCampaignsByAccountIdsResponse get() {
                return apiResponse;
            }
        });        
                
        FakeBulkService.setOnGetDetailedBulkDownloadStatus(new Consumer<GetDetailedBulkDownloadStatusRequest>() {
            @Override
            public void accept(GetDetailedBulkDownloadStatusRequest t) {
                assertEquals("req456", t.getRequestId());
            }
        });
        
        FakeBulkService.setGetDetailedBulkDownloadStatusResponse(new Supplier<GetDetailedBulkDownloadStatusResponse>() {
            @Override
            public GetDetailedBulkDownloadStatusResponse get() {
                GetDetailedBulkDownloadStatusResponse statusResponse = new GetDetailedBulkDownloadStatusResponse();
                statusResponse.setPercentComplete(100);
                statusResponse.setRequestStatus("Completed");
                statusResponse.setResultFileUrl("http://download.com/123");
                statusResponse.setForwardCompatibilityMap(new ArrayOfKeyValuePairOfstringstring());
                
                return statusResponse;
            }
        });   
        
        FakeBulkService.setInboundHeadersSupplier(createTrackingIdHeaderSupplier());
        
        final AuthorizationData authorizationData = createUserData();
        
        final DownloadParameters parameters = new DownloadParameters();        
        
        parameters.setDataScope(new ArrayList<DataScope>());
        parameters.getDataScope().add(DataScope.ENTITY_DATA);
        parameters.getDataScope().add(DataScope.ENTITY_PERFORMANCE_DATA);        

        parameters.setEntities(new ArrayList<BulkDownloadEntity>());
        Collection<BulkDownloadEntity> entities = parameters.getEntities();
        entities.add(BulkDownloadEntity.CAMPAIGNS);
        entities.add(BulkDownloadEntity.KEYWORDS);
 
        parameters.setPerformanceStatsDateRange(new PerformanceStatsDateRange());
        parameters.setLastSyncTimeInUTC(new GregorianCalendar(2014, 1, 2));
        
        parameters.setFileType(DownloadFileType.TSV);

        FakeBulkService.setOnDownloadCampaignsByAccountIdsRequest(new Consumer<DownloadCampaignsByAccountIdsRequest>() {
            @Override
            public void accept(DownloadCampaignsByAccountIdsRequest request) {
                assertEquals((Long)authorizationData.getAccountId(), request.getAccountIds().getLongs().get(0));
                assertEquals(parameters.getDataScope(), request.getDataScope());
                assertEquals(parameters.getEntities(), request.getEntities());
                assertEquals(parameters.getPerformanceStatsDateRange(), request.getPerformanceStatsDateRange());
                assertEquals(parameters.getLastSyncTimeInUTC(), request.getLastSyncTimeInUTC());
            }
        });                   
        
        FakeHttpFileService httpFileService = new FakeHttpFileService();

        httpFileService.setOnDownloadFile(new BiConsumer<String, File>() {
            @Override
            public void accept(String url, File file) {
                assertEquals("http://download.com/123", url);
            }
        });
        
        ZipExtractor zipExtractor = createMock(ZipExtractor.class);
          
        File expectedZipFile = new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK\\req456.zip");
        
        File expectedResultFile = new File(System.getProperty("java.io.tmpdir"), "BingAdsSDK\\req456");
        
        expect(zipExtractor.extractFirstEntryToFile(expectedZipFile, expectedResultFile, true, false)).andReturn(new File("file path"));
        
        BulkFileReaderFactory factory = createMock(BulkFileReaderFactory.class);
        
        BulkFileReader expectedReader = createMock(BulkFileReader.class);
        
        BulkEntityIterable bulkEntities = createMock(BulkEntityIterable.class);
        
        expect(expectedReader.getEntities()).andReturn(bulkEntities);
        
        expect(factory.createBulkFileReader(new File("file path"), ResultFileType.PARTIAL_DOWNLOAD, DownloadFileType.TSV)).andReturn(expectedReader);
        
        replay(zipExtractor, expectedReader, factory);

        BulkServiceManager bulkServiceManager = new BulkServiceManager(authorizationData);
        
        bulkServiceManager.setHttpFileService(httpFileService);
        bulkServiceManager.setZipExtractor(zipExtractor);
        bulkServiceManager.setBulkFileReaderFactory(factory);

        Iterable<BulkEntity> resultEntities = bulkServiceManager.downloadEntitiesAsync(parameters, null).get();                
        
        verify(zipExtractor);
        
        assertEquals(bulkEntities, resultEntities);
        assertTrue(httpFileService.getDownloadWasCalled());
    }
    
    private static AuthorizationData createUserData() {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new PasswordAuthentication("user", "pass"));
        authorizationData.setAccountId(123L);
        authorizationData.setCustomerId(456L);
        authorizationData.setDeveloperToken("dev");

        return authorizationData;
    }
}
