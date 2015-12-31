package com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeKeyword;
import com.microsoft.bingads.campaignmanagement.NegativeKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.Map;

public abstract class BulkCampaignNegativeKeywordTest extends BulkEntityTest<BulkCampaignNegativeKeyword> {

    @Override
    protected void onEntityCreation(BulkCampaignNegativeKeyword entity) {
        entity.setNegativeKeyword(new NegativeKeyword());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeKeyword, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignNegativeKeyword>() {
            @Override
            public BulkCampaignNegativeKeyword get() {
                return new BulkCampaignNegativeKeyword();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignNegativeKeyword, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeKeyword>() {
            @Override
            public BulkCampaignNegativeKeyword get() {
                return new BulkCampaignNegativeKeyword();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignNegativeKeyword, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeKeyword>() {
            @Override
            public BulkCampaignNegativeKeyword get() {
                return new BulkCampaignNegativeKeyword();
            }
        });
    }
}
