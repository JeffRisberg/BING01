package com.microsoft.bingads.api.test.entities.campaign.read;

import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.bulk.entities.BulkCampaign;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkCampaignReadFromRowValuesNameTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Campaign 1", "Test Campaign 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaign, String>() {
            @Override
            public String apply(BulkCampaign c) {
                return c.getCampaign().getName();
            }
        });
    }
}
