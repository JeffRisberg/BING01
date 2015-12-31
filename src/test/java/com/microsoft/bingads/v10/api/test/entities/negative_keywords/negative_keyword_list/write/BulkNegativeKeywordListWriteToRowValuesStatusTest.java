package com.microsoft.bingads.v10.api.test.entities.negative_keywords.negative_keyword_list.write;

import com.microsoft.bingads.v10.api.test.entities.negative_keywords.negative_keyword_list.BulkNegativeKeywordListTest;
import com.microsoft.bingads.v10.bulk.entities.BulkNegativeKeywordList;
import com.microsoft.bingads.v10.bulk.entities.Status;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkNegativeKeywordListWriteToRowValuesStatusTest extends BulkNegativeKeywordListTest {

    @Parameter(value = 1)
    public Status propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkNegativeKeywordList, Status>() {
            @Override
            public void accept(BulkNegativeKeywordList c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
