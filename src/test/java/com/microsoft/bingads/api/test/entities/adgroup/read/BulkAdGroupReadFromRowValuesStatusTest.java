package com.microsoft.bingads.api.test.entities.adgroup.read;

import com.microsoft.bingads.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.campaignmanagement.AdGroupStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesStatusTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdGroupStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdGroupStatus.ACTIVE},
            {"Deleted", AdGroupStatus.DELETED},
            {"Draft", AdGroupStatus.DRAFT},
            {"Paused", AdGroupStatus.PAUSED},
            {"Expired", AdGroupStatus.DELETED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AdGroupStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAdGroup, AdGroupStatus>() {
            @Override
            public AdGroupStatus apply(BulkAdGroup c) {
                return c.getAdGroup().getStatus();
            }
        });
    }
}
