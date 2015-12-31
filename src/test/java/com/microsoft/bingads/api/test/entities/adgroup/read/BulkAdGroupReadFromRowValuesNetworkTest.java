package com.microsoft.bingads.api.test.entities.adgroup.read;

import com.microsoft.bingads.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.campaignmanagement.Network;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesNetworkTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Network expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"OwnedAndOperatedAndSyndicatedSearch", Network.OWNED_AND_OPERATED_AND_SYNDICATED_SEARCH},
            {"OwnedAndOperatedOnly", Network.OWNED_AND_OPERATED_ONLY},
            {"SyndicatedSearchOnly", Network.SYNDICATED_SEARCH_ONLY}
        });
    }

    @Test
    public void testRead() {
        this.<Network>testReadProperty("Network Distribution", this.datum, this.expectedResult, new Function<BulkAdGroup, Network>() {
            @Override
            public Network apply(BulkAdGroup c) {
                return c.getAdGroup().getNetwork();
            }
        });
    }
}
