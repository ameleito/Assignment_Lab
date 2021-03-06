
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkForOverlay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkForOverlay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beforeObj" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/&gt;
 *         &lt;element name="afterObj" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkForOverlay", propOrder = {
    "beforeObj",
    "afterObj"
})
public class CheckForOverlay {

    protected PersonBean beforeObj;
    protected PersonBean afterObj;

    /**
     * Gets the value of the beforeObj property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getBeforeObj() {
        return beforeObj;
    }

    /**
     * Sets the value of the beforeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setBeforeObj(PersonBean value) {
        this.beforeObj = value;
    }

    /**
     * Gets the value of the afterObj property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getAfterObj() {
        return afterObj;
    }

    /**
     * Sets the value of the afterObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setAfterObj(PersonBean value) {
        this.afterObj = value;
    }

}
