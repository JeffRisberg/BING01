package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.gender.write;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.gender.BulkCampaignGenderTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignGenderTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignGenderTargetWriteToRowValuesBidAdjustmentTest extends BulkCampaignGenderTargetBidTest {

    @Parameter(value = 1)
    public int expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123}            
        });
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("Bid Adjustment", this.datum, this.expectedResult, new BiConsumer<BulkCampaignGenderTargetBid, Integer>() {
            @Override
            public void accept(BulkCampaignGenderTargetBid c, Integer value) {
                c.getGenderTargetBid().setBidAdjustment(value);
            }
        });
    }
}
