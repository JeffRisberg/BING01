package com.microsoft.bingads.api.test.entities.ad_extension.product.read;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
        {
                HasDeleteAllRowTest.class,
                ReadFromBulkReaderTest.class,
                BulkCampaignProductAdExtensionReadFromRowValuesCampaignNameTest.class
        }
)
public class BulkProductAdExtensionReadTests {

}
