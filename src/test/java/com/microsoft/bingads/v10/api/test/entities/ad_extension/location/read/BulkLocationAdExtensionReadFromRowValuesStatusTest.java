package com.microsoft.bingads.v10.api.test.entities.ad_extension.location.read;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.location.BulkLocationAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkLocationAdExtension;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkLocationAdExtensionReadFromRowValuesStatusTest extends BulkLocationAdExtensionTest {

    @Parameter(value = 1)
    public AdExtensionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdExtensionStatus.ACTIVE},
            {"Deleted", AdExtensionStatus.DELETED},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AdExtensionStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkLocationAdExtension, AdExtensionStatus>() {
            @Override
            public AdExtensionStatus apply(BulkLocationAdExtension c) {
                return c.getLocationAdExtension().getStatus();
            }
        });
    }
}
