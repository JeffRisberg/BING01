package com.microsoft.bingads.v10.api.test.entities.adgroup.read;

import com.microsoft.bingads.v10.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v10.campaignmanagement.AdRotation;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesNetworkNullTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"RotatingLikeARotisserieChicken"},
            {""},
            {null}
        });
    }

    @Test
    public void testRead() {
        this.<AdRotation>testReadProperty("Ad Rotation", this.datum, null, new Function<BulkAdGroup, AdRotation>() {
            @Override
            public AdRotation apply(BulkAdGroup c) {
                return c.getAdGroup().getAdRotation();
            }
        });
    }
}
