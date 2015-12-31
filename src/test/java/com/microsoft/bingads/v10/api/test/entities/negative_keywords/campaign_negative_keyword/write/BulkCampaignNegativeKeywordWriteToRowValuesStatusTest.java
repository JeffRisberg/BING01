package com.microsoft.bingads.v10.api.test.entities.negative_keywords.campaign_negative_keyword.write;

import com.microsoft.bingads.v10.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignNegativeKeyword;
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
public class BulkCampaignNegativeKeywordWriteToRowValuesStatusTest extends BulkCampaignNegativeKeywordTest {

    @Parameter(value = 1)
    public Status propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkCampaignNegativeKeyword, Status>() {
            @Override
            public void accept(BulkCampaignNegativeKeyword c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
