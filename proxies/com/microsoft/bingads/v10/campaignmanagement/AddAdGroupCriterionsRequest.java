
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroupCriterions" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfAdGroupCriterion" minOccurs="0"/>
 *         &lt;element name="CriterionType" type="{https://bingads.microsoft.com/CampaignManagement/v10}CriterionType" minOccurs="0"/>
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
    "accountId",
    "adGroupCriterions",
    "criterionType"
})
@XmlRootElement(name = "AddAdGroupCriterionsRequest")
public class AddAdGroupCriterionsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AdGroupCriterions", nillable = true)
    protected ArrayOfAdGroupCriterion adGroupCriterions;
    @XmlElement(name = "CriterionType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<CriterionType> criterionType;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the adGroupCriterions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupCriterion }
     *     
     */
    public ArrayOfAdGroupCriterion getAdGroupCriterions() {
        return adGroupCriterions;
    }

    /**
     * Sets the value of the adGroupCriterions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupCriterion }
     *     
     */
    public void setAdGroupCriterions(ArrayOfAdGroupCriterion value) {
        this.adGroupCriterions = value;
    }

    /**
     * Gets the value of the criterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CriterionType> getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the value of the criterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionType(Collection<CriterionType> value) {
        this.criterionType = value;
    }

}
