package com.microsoft.bingads.v10.api.test.operations.bulk_upload_operation;


import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.v10.api.test.operations.FakeApiTest;
import com.microsoft.bingads.v10.bulk.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v10.bulk.BulkUploadOperation;
import com.microsoft.bingads.v10.bulk.GetBulkUploadStatusResponse;
import com.microsoft.bingads.v10.bulk.IBulkService;

public class BulkUploadOperationTest extends FakeApiTest {

    protected IBulkService service;

    private static AuthorizationData createUserData() {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new PasswordAuthentication("user", "pass"));
        authorizationData.setAccountId(123L);
        authorizationData.setCustomerId(456L);
        authorizationData.setDeveloperToken("dev");

        return authorizationData;
    }

    protected BulkUploadOperation createBulkUploadOperation(Integer statusCheckIntervalInMs) {
        BulkUploadOperation operation = new BulkUploadOperation("request123", createUserData(), service);

        if (statusCheckIntervalInMs != null) {
            operation.setStatusPollIntervalInMilliseconds(statusCheckIntervalInMs);
        }

        return operation;
    }

    protected GetBulkUploadStatusResponse createStatusResponse(Integer percentComplete, String status, String resultFileUrl) {
        GetBulkUploadStatusResponse response = new GetBulkUploadStatusResponse();
        response.setForwardCompatibilityMap(new ArrayOfKeyValuePairOfstringstring());
        response.setPercentComplete(percentComplete);
        response.setRequestStatus(status);
        response.setResultFileUrl(resultFileUrl);

        return response;
    }

    public BulkUploadOperationTest() {
        super();
    }

}
