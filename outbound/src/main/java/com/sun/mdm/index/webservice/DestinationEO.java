
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for destinationEO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="destinationEO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterprisePerson" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destinationEO", propOrder = {
    "enterprisePerson"
})
public class DestinationEO {

    protected EnterprisePerson enterprisePerson;

    /**
     * Gets the value of the enterprisePerson property.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getEnterprisePerson() {
        return enterprisePerson;
    }

    /**
     * Sets the value of the enterprisePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setEnterprisePerson(EnterprisePerson value) {
        this.enterprisePerson = value;
    }

}
