
package com.microsoft.bingads.v10.campaignmanagement;

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
 *         &lt;element name="PlacementDetails" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfArrayOfPlacementDetail" minOccurs="0"/>
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
    "placementDetails"
})
@XmlRootElement(name = "GetPlacementDetailsForUrlsResponse")
public class GetPlacementDetailsForUrlsResponse {

    @XmlElement(name = "PlacementDetails", nillable = true)
    protected ArrayOfArrayOfPlacementDetail placementDetails;

    /**
     * Gets the value of the placementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfPlacementDetail }
     *     
     */
    public ArrayOfArrayOfPlacementDetail getPlacementDetails() {
        return placementDetails;
    }

    /**
     * Sets the value of the placementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfPlacementDetail }
     *     
     */
    public void setPlacementDetails(ArrayOfArrayOfPlacementDetail value) {
        this.placementDetails = value;
    }

}
