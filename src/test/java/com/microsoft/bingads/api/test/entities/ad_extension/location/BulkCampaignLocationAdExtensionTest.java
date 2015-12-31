package com.microsoft.bingads.api.test.entities.ad_extension.location;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignLocationAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkCampaignLocationAdExtensionTest extends BulkEntityTest<BulkCampaignLocationAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignLocationAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignLocationAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignLocationAdExtension>() {
            @Override
            public BulkCampaignLocationAdExtension get() {
                return new BulkCampaignLocationAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignLocationAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignLocationAdExtension>() {
            @Override
            public BulkCampaignLocationAdExtension get() {
                return new BulkCampaignLocationAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignLocationAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignLocationAdExtension>() {
            @Override
            public BulkCampaignLocationAdExtension get() {
                return new BulkCampaignLocationAdExtension();
            }
        });
    }
}
