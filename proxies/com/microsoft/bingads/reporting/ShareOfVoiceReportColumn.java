
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareOfVoiceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareOfVoiceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="KeywordId"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AveragePosition"/>
 *     &lt;enumeration value="ImpressionSharePercent"/>
 *     &lt;enumeration value="ImpressionLostToBudgetPercent"/>
 *     &lt;enumeration value="ImpressionLostToRankPercent"/>
 *     &lt;enumeration value="ImpressionLostToLandingPageRelevancePercent"/>
 *     &lt;enumeration value="ImpressionLostToKeywordRelevancePercent"/>
 *     &lt;enumeration value="ImpressionLostToRelevancePercent"/>
 *     &lt;enumeration value="ImpressionLostToBidPercent"/>
 *     &lt;enumeration value="CurrentMaxCpc"/>
 *     &lt;enumeration value="QualityScore"/>
 *     &lt;enumeration value="KeywordRelevance"/>
 *     &lt;enumeration value="LandingPageRelevance"/>
 *     &lt;enumeration value="LandingPageUserExperience"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="ClickSharePercent"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="Network"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShareOfVoiceReportColumn")
@XmlEnum
public enum ShareOfVoiceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("KeywordId")
    KEYWORD_ID("KeywordId"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
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
    @XmlEnumValue("ImpressionSharePercent")
    IMPRESSION_SHARE_PERCENT("ImpressionSharePercent"),
    @XmlEnumValue("ImpressionLostToBudgetPercent")
    IMPRESSION_LOST_TO_BUDGET_PERCENT("ImpressionLostToBudgetPercent"),
    @XmlEnumValue("ImpressionLostToRankPercent")
    IMPRESSION_LOST_TO_RANK_PERCENT("ImpressionLostToRankPercent"),
    @XmlEnumValue("ImpressionLostToLandingPageRelevancePercent")
    IMPRESSION_LOST_TO_LANDING_PAGE_RELEVANCE_PERCENT("ImpressionLostToLandingPageRelevancePercent"),
    @XmlEnumValue("ImpressionLostToKeywordRelevancePercent")
    IMPRESSION_LOST_TO_KEYWORD_RELEVANCE_PERCENT("ImpressionLostToKeywordRelevancePercent"),
    @XmlEnumValue("ImpressionLostToRelevancePercent")
    IMPRESSION_LOST_TO_RELEVANCE_PERCENT("ImpressionLostToRelevancePercent"),
    @XmlEnumValue("ImpressionLostToBidPercent")
    IMPRESSION_LOST_TO_BID_PERCENT("ImpressionLostToBidPercent"),
    @XmlEnumValue("CurrentMaxCpc")
    CURRENT_MAX_CPC("CurrentMaxCpc"),
    @XmlEnumValue("QualityScore")
    QUALITY_SCORE("QualityScore"),
    @XmlEnumValue("KeywordRelevance")
    KEYWORD_RELEVANCE("KeywordRelevance"),
    @XmlEnumValue("LandingPageRelevance")
    LANDING_PAGE_RELEVANCE("LandingPageRelevance"),
    @XmlEnumValue("LandingPageUserExperience")
    LANDING_PAGE_USER_EXPERIENCE("LandingPageUserExperience"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("AdDistribution")
    AD_DISTRIBUTION("AdDistribution"),
    @XmlEnumValue("ClickSharePercent")
    CLICK_SHARE_PERCENT("ClickSharePercent"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Network")
    NETWORK("Network");
    private final String value;

    ShareOfVoiceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareOfVoiceReportColumn fromValue(String v) {
        for (ShareOfVoiceReportColumn c: ShareOfVoiceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
