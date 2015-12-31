
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegativeKeywordConflictReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NegativeKeywordConflictReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Reporting/v9}ReportRequest">
 *       &lt;sequence>
 *         &lt;element name="Columns" type="{https://bingads.microsoft.com/Reporting/v9}ArrayOfNegativeKeywordConflictReportColumn"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/Reporting/v9}AccountThroughAdGroupReportScope"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegativeKeywordConflictReportRequest", propOrder = {
    "columns",
    "scope"
})
public class NegativeKeywordConflictReportRequest
    extends ReportRequest
{

    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfNegativeKeywordConflictReportColumn columns;
    @XmlElement(name = "Scope", required = true, nillable = true)
    protected AccountThroughAdGroupReportScope scope;

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNegativeKeywordConflictReportColumn }
     *     
     */
    public ArrayOfNegativeKeywordConflictReportColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNegativeKeywordConflictReportColumn }
     *     
     */
    public void setColumns(ArrayOfNegativeKeywordConflictReportColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link AccountThroughAdGroupReportScope }
     *     
     */
    public AccountThroughAdGroupReportScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountThroughAdGroupReportScope }
     *     
     */
    public void setScope(AccountThroughAdGroupReportScope value) {
        this.scope = value;
    }

}
