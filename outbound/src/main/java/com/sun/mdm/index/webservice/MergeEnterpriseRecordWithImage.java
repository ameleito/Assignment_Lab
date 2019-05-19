
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergeEnterpriseRecordWithImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergeEnterpriseRecordWithImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="fromEUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationEO" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/&gt;
 *         &lt;element name="calculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="setSourceSystemStatusToMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeEnterpriseRecordWithImage", propOrder = {
    "callerInfo",
    "fromEUID",
    "destinationEO",
    "calculateOnly",
    "setSourceSystemStatusToMerged"
})
public class MergeEnterpriseRecordWithImage {

    protected CallerInfo callerInfo;
    protected String fromEUID;
    protected EnterprisePerson destinationEO;
    protected boolean calculateOnly;
    protected boolean setSourceSystemStatusToMerged;

    /**
     * Gets the value of the callerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CallerInfo }
     *     
     */
    public CallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * Sets the value of the callerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerInfo }
     *     
     */
    public void setCallerInfo(CallerInfo value) {
        this.callerInfo = value;
    }

    /**
     * Gets the value of the fromEUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEUID() {
        return fromEUID;
    }

    /**
     * Sets the value of the fromEUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEUID(String value) {
        this.fromEUID = value;
    }

    /**
     * Gets the value of the destinationEO property.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getDestinationEO() {
        return destinationEO;
    }

    /**
     * Sets the value of the destinationEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setDestinationEO(EnterprisePerson value) {
        this.destinationEO = value;
    }

    /**
     * Gets the value of the calculateOnly property.
     * 
     */
    public boolean isCalculateOnly() {
        return calculateOnly;
    }

    /**
     * Sets the value of the calculateOnly property.
     * 
     */
    public void setCalculateOnly(boolean value) {
        this.calculateOnly = value;
    }

    /**
     * Gets the value of the setSourceSystemStatusToMerged property.
     * 
     */
    public boolean isSetSourceSystemStatusToMerged() {
        return setSourceSystemStatusToMerged;
    }

    /**
     * Sets the value of the setSourceSystemStatusToMerged property.
     * 
     */
    public void setSetSourceSystemStatusToMerged(boolean value) {
        this.setSourceSystemStatusToMerged = value;
    }

}
