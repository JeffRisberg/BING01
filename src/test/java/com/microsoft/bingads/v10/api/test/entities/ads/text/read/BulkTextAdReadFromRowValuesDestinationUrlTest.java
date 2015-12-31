package com.microsoft.bingads.v10.api.test.entities.ads.text.read;

import com.microsoft.bingads.v10.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.v10.bulk.entities.BulkTextAd;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkTextAdReadFromRowValuesDestinationUrlTest extends BulkTextAdTest {

    @Parameter(value = 1)
    public String expectedResult;

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
            {"http://www.go-there.mic", "http://www.go-there.mic"},
            {"", ""},
            {null, ""}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Destination Url", this.datum, this.expectedResult, new Function<BulkTextAd, String>() {
            @Override
            public String apply(BulkTextAd c) {
                return c.getTextAd().getDestinationUrl();
            }
        });
    }
}
