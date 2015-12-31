package com.microsoft.bingads.v10.api.test.entities.ad_extension.call.read;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCallAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCallAdExtensionReadFromRowValuesVersionTest extends BulkCallAdExtensionTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123},
            {"2147483647", 2147483647},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("Version", this.datum, this.expectedResult, new Function<BulkCallAdExtension, Integer>() {
            @Override
            public Integer apply(BulkCallAdExtension c) {
                return c.getCallAdExtension().getVersion();
            }
        });
    }
}
