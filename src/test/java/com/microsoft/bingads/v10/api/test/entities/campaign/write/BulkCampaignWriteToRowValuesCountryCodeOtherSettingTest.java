package com.microsoft.bingads.v10.api.test.entities.campaign.write;

import com.microsoft.bingads.v10.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v10.campaignmanagement.ShoppingSetting;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkCampaignWriteToRowValuesCountryCodeOtherSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, ""},
                {null, "US"},
                {null, null},
                {null, "CHINA"}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Country Code", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, String>() {
            @Override
            public void accept(BulkCampaign c, String v) {
                c.getCampaign().setSettings(new ArrayOfSetting());
                ShoppingSetting setting = new ShoppingSetting();
                setting.setSalesCountryCode(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
