package com.microsoft.bingads.v10.api.test.entities.ad_group_product_partition.write;

import com.microsoft.bingads.v10.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v10.campaignmanagement.Bid;
import com.microsoft.bingads.v10.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v10.campaignmanagement.ProductPartition;
import com.microsoft.bingads.v10.internal.bulk.StringExtensions;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class WriteFinalMobileUrlsTest extends BulkAdGroupProductPartitionTest {
	@Parameter(value = 1)
    public ArrayOfstring propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "http://www.test 1.com", "https://www.test2.com" }));
		
        return Arrays.asList(new Object[][]{
            {null, null},
            {"delete_value", new ArrayOfstring()},
            {"http://www.test 1.com; https://www.test2.com", array},
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Final Url",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, ArrayOfstring>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, ArrayOfstring v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setFinalUrls(v);
                    }
                }
        );
    }

}
