
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resolvePotentialDuplicate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resolvePotentialDuplicate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="potentialDuplicateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permanentResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resolvePotentialDuplicate", propOrder = {
    "callerInfo",
    "potentialDuplicateId",
    "permanentResolve"
})
public class ResolvePotentialDuplicate {

    protected CallerInfo callerInfo;
    protected String potentialDuplicateId;
    protected boolean permanentResolve;

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

    /**
     * Gets the value of the permanentResolve property.
     * 
     */
    public boolean isPermanentResolve() {
        return permanentResolve;
    }

    /**
     * Sets the value of the permanentResolve property.
     * 
     */
    public void setPermanentResolve(boolean value) {
        this.permanentResolve = value;
    }

}
