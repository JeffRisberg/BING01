
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchQueryPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchQueryPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="AdType"/>
 *     &lt;enumeration value="DestinationUrl"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AdStatus"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AveragePosition"/>
 *     &lt;enumeration value="SearchQuery"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="ProductTarget"/>
 *     &lt;enumeration value="AdGroupCriterionId"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="KeywordId"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="ExtendedCost"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchQueryPerformanceReportColumn")
@XmlEnum
public enum SearchQueryPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
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
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),
    @XmlEnumValue("DestinationUrl")
    DESTINATION_URL("DestinationUrl"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("AveragePosition")
    AVERAGE_POSITION("AveragePosition"),
    @XmlEnumValue("SearchQuery")
    SEARCH_QUERY("SearchQuery"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("ProductTarget")
    PRODUCT_TARGET("ProductTarget"),
    @XmlEnumValue("AdGroupCriterionId")
    AD_GROUP_CRITERION_ID("AdGroupCriterionId"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("KeywordId")
    KEYWORD_ID("KeywordId"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("ExtendedCost")
    EXTENDED_COST("ExtendedCost"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist");
    private final String value;

    SearchQueryPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchQueryPerformanceReportColumn fromValue(String v) {
        for (SearchQueryPerformanceReportColumn c: SearchQueryPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
