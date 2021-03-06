
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unresolvePotentialDuplicate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unresolvePotentialDuplicate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="potentialDuplicateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unresolvePotentialDuplicate", propOrder = {
    "callerInfo",
    "potentialDuplicateId"
})
public class UnresolvePotentialDuplicate {

    protected CallerInfo callerInfo;
    protected String potentialDuplicateId;

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
     * Gets the value of the potentialDuplicateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotentialDuplicateId() {
        return potentialDuplicateId;
    }

    /**
     * Sets the value of the potentialDuplicateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotentialDuplicateId(String value) {
        this.potentialDuplicateId = value;
    }

}
