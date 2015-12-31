
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AveragePosition"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="LowQualityClicks"/>
 *     &lt;enumeration value="LowQualityClicksPercent"/>
 *     &lt;enumeration value="LowQualityImpressions"/>
 *     &lt;enumeration value="LowQualityImpressionsPercent"/>
 *     &lt;enumeration value="LowQualityConversions"/>
 *     &lt;enumeration value="LowQualityConversionRate"/>
 *     &lt;enumeration value="AverageCpm"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="ImpressionSharePercent"/>
 *     &lt;enumeration value="ImpressionLostToBudgetPercent"/>
 *     &lt;enumeration value="ImpressionLostToRankPercent"/>
 *     &lt;enumeration value="QualityScore"/>
 *     &lt;enumeration value="KeywordRelevance"/>
 *     &lt;enumeration value="LandingPageRelevance"/>
 *     &lt;enumeration value="LandingPageUserExperience"/>
 *     &lt;enumeration value="HistoricQualityScore"/>
 *     &lt;enumeration value="HistoricKeywordRelevance"/>
 *     &lt;enumeration value="HistoricLandingPageRelevance"/>
 *     &lt;enumeration value="HistoricLandingPageUserExperience"/>
 *     &lt;enumeration value="ImpressionLostToBidPercent"/>
 *     &lt;enumeration value="ImpressionLostToLandingPageRelevancePercent"/>
 *     &lt;enumeration value="ImpressionLostToKeywordRelevancePercent"/>
 *     &lt;enumeration value="PhoneImpressions"/>
 *     &lt;enumeration value="PhoneCalls"/>
 *     &lt;enumeration value="ManualCalls"/>
 *     &lt;enumeration value="ClickCalls"/>
 *     &lt;enumeration value="Ptr"/>
 *     &lt;enumeration value="PhoneSpend"/>
 *     &lt;enumeration value="AverageCpp"/>
 *     &lt;enumeration value="TotalCostPhoneAndClicks"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="ExtendedCost"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *     &lt;enumeration value="BounceRate"/>
 *     &lt;enumeration value="TotalVisits"/>
 *     &lt;enumeration value="AveragePagesPerVisit"/>
 *     &lt;enumeration value="AverageDurationPerVisit"/>
 *     &lt;enumeration value="TrackingTemplate"/>
 *     &lt;enumeration value="CustomParameters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignPerformanceReportColumn")
@XmlEnum
public enum CampaignPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("AdDistribution")
    AD_DISTRIBUTION("AdDistribution"),
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
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("LowQualityClicks")
    LOW_QUALITY_CLICKS("LowQualityClicks"),
    @XmlEnumValue("LowQualityClicksPercent")
    LOW_QUALITY_CLICKS_PERCENT("LowQualityClicksPercent"),
    @XmlEnumValue("LowQualityImpressions")
    LOW_QUALITY_IMPRESSIONS("LowQualityImpressions"),
    @XmlEnumValue("LowQualityImpressionsPercent")
    LOW_QUALITY_IMPRESSIONS_PERCENT("LowQualityImpressionsPercent"),
    @XmlEnumValue("LowQualityConversions")
    LOW_QUALITY_CONVERSIONS("LowQualityConversions"),
    @XmlEnumValue("LowQualityConversionRate")
    LOW_QUALITY_CONVERSION_RATE("LowQualityConversionRate"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("ImpressionSharePercent")
    IMPRESSION_SHARE_PERCENT("ImpressionSharePercent"),
    @XmlEnumValue("ImpressionLostToBudgetPercent")
    IMPRESSION_LOST_TO_BUDGET_PERCENT("ImpressionLostToBudgetPercent"),
    @XmlEnumValue("ImpressionLostToRankPercent")
    IMPRESSION_LOST_TO_RANK_PERCENT("ImpressionLostToRankPercent"),
    @XmlEnumValue("QualityScore")
    QUALITY_SCORE("QualityScore"),
    @XmlEnumValue("KeywordRelevance")
    KEYWORD_RELEVANCE("KeywordRelevance"),
    @XmlEnumValue("LandingPageRelevance")
    LANDING_PAGE_RELEVANCE("LandingPageRelevance"),
    @XmlEnumValue("LandingPageUserExperience")
    LANDING_PAGE_USER_EXPERIENCE("LandingPageUserExperience"),
    @XmlEnumValue("HistoricQualityScore")
    HISTORIC_QUALITY_SCORE("HistoricQualityScore"),
    @XmlEnumValue("HistoricKeywordRelevance")
    HISTORIC_KEYWORD_RELEVANCE("HistoricKeywordRelevance"),
    @XmlEnumValue("HistoricLandingPageRelevance")
    HISTORIC_LANDING_PAGE_RELEVANCE("HistoricLandingPageRelevance"),
    @XmlEnumValue("HistoricLandingPageUserExperience")
    HISTORIC_LANDING_PAGE_USER_EXPERIENCE("HistoricLandingPageUserExperience"),
    @XmlEnumValue("ImpressionLostToBidPercent")
    IMPRESSION_LOST_TO_BID_PERCENT("ImpressionLostToBidPercent"),
    @XmlEnumValue("ImpressionLostToLandingPageRelevancePercent")
    IMPRESSION_LOST_TO_LANDING_PAGE_RELEVANCE_PERCENT("ImpressionLostToLandingPageRelevancePercent"),
    @XmlEnumValue("ImpressionLostToKeywordRelevancePercent")
    IMPRESSION_LOST_TO_KEYWORD_RELEVANCE_PERCENT("ImpressionLostToKeywordRelevancePercent"),
    @XmlEnumValue("PhoneImpressions")
    PHONE_IMPRESSIONS("PhoneImpressions"),
    @XmlEnumValue("PhoneCalls")
    PHONE_CALLS("PhoneCalls"),
    @XmlEnumValue("ManualCalls")
    MANUAL_CALLS("ManualCalls"),
    @XmlEnumValue("ClickCalls")
    CLICK_CALLS("ClickCalls"),
    @XmlEnumValue("Ptr")
    PTR("Ptr"),
    @XmlEnumValue("PhoneSpend")
    PHONE_SPEND("PhoneSpend"),
    @XmlEnumValue("AverageCpp")
    AVERAGE_CPP("AverageCpp"),
    @XmlEnumValue("TotalCostPhoneAndClicks")
    TOTAL_COST_PHONE_AND_CLICKS("TotalCostPhoneAndClicks"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
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
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("BounceRate")
    BOUNCE_RATE("BounceRate"),
    @XmlEnumValue("TotalVisits")
    TOTAL_VISITS("TotalVisits"),
    @XmlEnumValue("AveragePagesPerVisit")
    AVERAGE_PAGES_PER_VISIT("AveragePagesPerVisit"),
    @XmlEnumValue("AverageDurationPerVisit")
    AVERAGE_DURATION_PER_VISIT("AverageDurationPerVisit"),
    @XmlEnumValue("TrackingTemplate")
    TRACKING_TEMPLATE("TrackingTemplate"),
    @XmlEnumValue("CustomParameters")
    CUSTOM_PARAMETERS("CustomParameters");
    private final String value;

    CampaignPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignPerformanceReportColumn fromValue(String v) {
        for (CampaignPerformanceReportColumn c: CampaignPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
