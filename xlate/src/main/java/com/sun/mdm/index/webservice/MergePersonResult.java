
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergePersonResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergePersonResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="destinationEO" type="{http://webservice.index.mdm.sun.com/}destinationEO" minOccurs="0"/&gt;
 *         &lt;element name="sourceEO" type="{http://webservice.index.mdm.sun.com/}sourceEO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergePersonResult", propOrder = {
    "destinationEO",
    "sourceEO"
})
public class MergePersonResult {

    protected DestinationEO destinationEO;
    protected SourceEO sourceEO;

    /**
     * Gets the value of the destinationEO property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationEO }
     *     
     */
    public DestinationEO getDestinationEO() {
        return destinationEO;
    }

    /**
     * Sets the value of the destinationEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationEO }
     *     
     */
    public void setDestinationEO(DestinationEO value) {
        this.destinationEO = value;
    }

    /**
     * Gets the value of the sourceEO property.
     * 
     * @return
     *     possible object is
     *     {@link SourceEO }
     *     
     */
    public SourceEO getSourceEO() {
        return sourceEO;
    }

    /**
     * Sets the value of the sourceEO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceEO }
     *     
     */
    public void setSourceEO(SourceEO value) {
        this.sourceEO = value;
    }

}
