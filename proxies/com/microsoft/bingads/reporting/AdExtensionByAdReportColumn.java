
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionByAdReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdExtensionByAdReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdTitle"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="AdExtensionType"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="ClickType"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="TotalClicks"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AdExtensionId"/>
 *     &lt;enumeration value="AdExtensionVersion"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="ExtendedCost"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdExtensionByAdReportColumn")
@XmlEnum
public enum AdExtensionByAdReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdTitle")
    AD_TITLE("AdTitle"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdExtensionType")
    AD_EXTENSION_TYPE("AdExtensionType"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("ClickType")
    CLICK_TYPE("ClickType"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("TotalClicks")
    TOTAL_CLICKS("TotalClicks"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("AdExtensionId")
    AD_EXTENSION_ID("AdExtensionId"),
    @XmlEnumValue("AdExtensionVersion")
    AD_EXTENSION_VERSION("AdExtensionVersion"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("ExtendedCost")
    EXTENDED_COST("ExtendedCost"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist");
    private final String value;

    AdExtensionByAdReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdExtensionByAdReportColumn fromValue(String v) {
        for (AdExtensionByAdReportColumn c: AdExtensionByAdReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
