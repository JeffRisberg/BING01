package com.microsoft.bingads.api.test.entities.ad_extension.app.write;

import com.microsoft.bingads.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAppAdExtensionWriteFromRowValuesIdTest extends BulkAppAdExtensionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    /*
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays.  For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
                {"123", 123L},
                {"9223372036854775807", 9223372036854775807L},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Id", this.datum, this.expectedResult, new BiConsumer<BulkAppAdExtension, Long>() {
            @Override
            public void accept(BulkAppAdExtension c, Long v) {
                c.getAppAdExtension().setId(v);
            }
        });
    }
}
