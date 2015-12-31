package com.microsoft.bingads.v10.api.test.entities.ad_extension.image.read;

import com.microsoft.bingads.v10.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v10.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkImageAdExtensionReadFromRowValuesMediaIdTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public ArrayOflong expectedResult;

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
        ArrayOflong array = new ArrayOflong();
		
        array.getLongs().addAll(Arrays.asList(new Long[] { 123L, 456L }));
		return Arrays.asList(new Object[][] {
			{"", null},
			{"123;456", array},
		});
    }
    
    @Test
    public void testRead() {
        this.<ArrayOflong>testReadProperty("Media Ids", this.datum, this.expectedResult, new Function<BulkImageAdExtension, ArrayOflong>() {
            @Override
            public ArrayOflong apply(BulkImageAdExtension c) {
                return c.getImageAdExtension().getImageMediaIds();
            }
            
        }, new Supplier<BulkImageAdExtension>() {
            @Override
            public BulkImageAdExtension get() {
                return new BulkImageAdExtension();
            }
        }, new ObjectComparer<ArrayOflong>());
    }
}
