package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.daytime.read;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.Day;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetReadFromRowValuesDayTest extends BulkCampaignDayTimeTargetBidTest {

    @Parameter(value = 1)
    public Day expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Monday", Day.MONDAY},
            {"Tuesday", Day.TUESDAY},
            {"Wednesday", Day.WEDNESDAY},
            {"Thursday", Day.THURSDAY},
            {"Friday", Day.FRIDAY},
            {"Saturday", Day.SATURDAY},
            {"Sunday", Day.SUNDAY},
        });
    }

    @Test
    public void testRead() {
        this.<Day>testReadProperty("Target", this.datum, this.expectedResult, new Function<BulkCampaignDayTimeTargetBid, Day>() {
            @Override
            public Day apply(BulkCampaignDayTimeTargetBid c) {
                return c.getDayTimeTargetBid().getDay();
            }
        });
    }
}
