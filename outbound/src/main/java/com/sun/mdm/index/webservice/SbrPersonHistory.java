
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sbrPersonHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sbrPersonHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="after" type="{http://webservice.index.mdm.sun.com/}sbrPerson" minOccurs="0"/&gt;
 *         &lt;element name="before" type="{http://webservice.index.mdm.sun.com/}sbrPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sbrPersonHistory", propOrder = {
    "after",
    "before"
})
public class SbrPersonHistory {

    protected SbrPerson after;
    protected SbrPerson before;

    /**
     * Gets the value of the after property.
     * 
     * @return
     *     possible object is
     *     {@link SbrPerson }
     *     
     */
    public SbrPerson getAfter() {
        return after;
    }

    /**
     * Sets the value of the after property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbrPerson }
     *     
     */
    public void setAfter(SbrPerson value) {
        this.after = value;
    }

    /**
     * Gets the value of the before property.
     * 
     * @return
     *     possible object is
     *     {@link SbrPerson }
     *     
     */
    public SbrPerson getBefore() {
        return before;
    }

    /**
     * Sets the value of the before property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbrPerson }
     *     
     */
    public void setBefore(SbrPerson value) {
        this.before = value;
    }

}
