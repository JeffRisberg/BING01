package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.daytime.write;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.daytime.BulkCampaignDayTimeTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.v10.bulk.entities.Status;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDayTimeTargetBidWriteToRowValuesStatusTest extends BulkCampaignDayTimeTargetBidTest {

    @Parameter(value = 1)
    public Status propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},            
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkCampaignDayTimeTargetBid, Status>() {
            @Override
            public void accept(BulkCampaignDayTimeTargetBid c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
