package com.microsoft.bingads.v10.api.test.entities.ad_group_product_partition.write;

import com.microsoft.bingads.v10.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v10.campaignmanagement.*;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class WriteProductConditionTest extends BulkAdGroupProductPartitionTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWriteExcluded() {
        testWriteProperty(
                "Product Condition 1",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, String>() {

                    @Override
                    public void accept(BulkAdGroupProductPartition c, String v) {
                        ProductCondition condition = new ProductCondition();

                        ProductPartition criterion = new ProductPartition();

                        criterion.setCondition(condition);

                        AdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        condition.setOperand(v);
                    }
                }
        );
    }

    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Product Condition 1",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, String>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, String v) {
                        ProductCondition condition = new ProductCondition();

                        ProductPartition criterion = new ProductPartition();

                        criterion.setCondition(condition);

                        AdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        condition.setOperand(v);
                    }
                }
        );
    }
}
