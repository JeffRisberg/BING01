package com.microsoft.bingads.v10.api.test.entities.ad_extension.app.write;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkAppAdExtensionWriteFromRowValuesAppStoreIdTest extends BulkAppAdExtensionTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"App Store Id string", "App Store Id string"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("App Id", this.datum, this.expectedResult, new BiConsumer<BulkAppAdExtension, String>() {
            @Override
            public void accept(BulkAppAdExtension c, String v) {
                c.getAppAdExtension().setAppStoreId(v);
            }
        });
    }
}
