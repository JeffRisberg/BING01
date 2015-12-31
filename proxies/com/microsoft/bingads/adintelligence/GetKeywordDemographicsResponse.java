
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordDemographicResult" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordDemographicResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywordDemographicResult"
})
@XmlRootElement(name = "GetKeywordDemographicsResponse", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
public class GetKeywordDemographicsResponse {

    @XmlElement(name = "KeywordDemographicResult", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOfKeywordDemographicResult keywordDemographicResult;

    /**
     * Gets the value of the keywordDemographicResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordDemographicResult }
     *     
     */
    public ArrayOfKeywordDemographicResult getKeywordDemographicResult() {
        return keywordDemographicResult;
    }

    /**
     * Sets the value of the keywordDemographicResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordDemographicResult }
     *     
     */
    public void setKeywordDemographicResult(ArrayOfKeywordDemographicResult value) {
        this.keywordDemographicResult = value;
    }

}
