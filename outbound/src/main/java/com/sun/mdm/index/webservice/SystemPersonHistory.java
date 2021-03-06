
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemPersonHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemPersonHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="after" type="{http://webservice.index.mdm.sun.com/}systemPersonHistoryImage" minOccurs="0"/&gt;
 *         &lt;element name="before" type="{http://webservice.index.mdm.sun.com/}systemPersonHistoryImage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemPersonHistory", propOrder = {
    "after",
    "before"
})
public class SystemPersonHistory {

    protected SystemPersonHistoryImage after;
    protected SystemPersonHistoryImage before;

    /**
     * Gets the value of the after property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPersonHistoryImage }
     *     
     */
    public SystemPersonHistoryImage getAfter() {
        return after;
    }

    /**
     * Sets the value of the after property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPersonHistoryImage }
     *     
     */
    public void setAfter(SystemPersonHistoryImage value) {
        this.after = value;
    }

    /**
     * Gets the value of the before property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPersonHistoryImage }
     *     
     */
    public SystemPersonHistoryImage getBefore() {
        return before;
    }

    /**
     * Sets the value of the before property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPersonHistoryImage }
     *     
     */
    public void setBefore(SystemPersonHistoryImage value) {
        this.before = value;
    }

}
