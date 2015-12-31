package com.microsoft.bingads.v10.api.test.entities.campaign_product_scope.write;

import com.microsoft.bingads.v10.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WriteIdTest extends BulkCampaignProductScopeTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Id",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignProductScope, Long>() {
                    @Override
                    public void accept(BulkCampaignProductScope c, Long v) {
                        c.getCampaignCriterion().setId(v);
                    }
                }
        );
    }
}
