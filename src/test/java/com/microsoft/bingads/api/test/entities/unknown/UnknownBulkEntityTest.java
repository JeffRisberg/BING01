package com.microsoft.bingads.api.test.entities.unknown;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.UnknownBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.Map;

public abstract class UnknownBulkEntityTest extends BulkEntityTest<UnknownBulkEntity> {

    @Override
    protected void onEntityCreation(UnknownBulkEntity entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<UnknownBulkEntity, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<UnknownBulkEntity>() {
            @Override
            public UnknownBulkEntity get() {
                return new UnknownBulkEntity();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<UnknownBulkEntity, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<UnknownBulkEntity>() {
            @Override
            public UnknownBulkEntity get() {
                return new UnknownBulkEntity();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<UnknownBulkEntity, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<UnknownBulkEntity>() {
            @Override
            public UnknownBulkEntity get() {
                return new UnknownBulkEntity();
            }
        });
    }
}
