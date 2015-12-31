package com.microsoft.bingads.v10.api.test.entities.ad_extension.image;

import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.v10.campaignmanagement.ImageAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkImageAdExtensionTest extends BulkEntityTest<BulkImageAdExtension> {

    @Override
    protected void onEntityCreation(BulkImageAdExtension entity) {
        entity.setImageAdExtension(new ImageAdExtension());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkImageAdExtension, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkImageAdExtension>() {
            @Override
            public BulkImageAdExtension get() {
                return new BulkImageAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkImageAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkImageAdExtension>() {
            @Override
            public BulkImageAdExtension get() {
                return new BulkImageAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkImageAdExtension, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkImageAdExtension>() {
            @Override
            public BulkImageAdExtension get() {
                return new BulkImageAdExtension();
            }
        });
    }

}
