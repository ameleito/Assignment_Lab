
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchColResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matchColResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchFieldChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="overlayDetected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="potentialDuplicates" type="{http://webservice.index.mdm.sun.com/}potentialDuplicateRecordArray" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchColResult", propOrder = {
    "euid",
    "matchFieldChanged",
    "overlayDetected",
    "potentialDuplicates",
    "resultCode"
})
public class MatchColResult {

    @XmlElement(name = "EUID")
    protected String euid;
    protected boolean matchFieldChanged;
    protected boolean overlayDetected;
    protected PotentialDuplicateRecordArray potentialDuplicates;
    protected int resultCode;

    /**
     * Gets the value of the euid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID() {
        return euid;
    }

    /**
     * Sets the value of the euid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID(String value) {
        this.euid = value;
    }

    /**
     * Gets the value of the matchFieldChanged property.
     * 
     */
    public boolean isMatchFieldChanged() {
        return matchFieldChanged;
    }

    /**
     * Sets the value of the matchFieldChanged property.
     * 
     */
    public void setMatchFieldChanged(boolean value) {
        this.matchFieldChanged = value;
    }

    /**
     * Gets the value of the overlayDetected property.
     * 
     */
    public boolean isOverlayDetected() {
        return overlayDetected;
    }

    /**
     * Sets the value of the overlayDetected property.
     * 
     */
    public void setOverlayDetected(boolean value) {
        this.overlayDetected = value;
    }

    /**
     * Gets the value of the potentialDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link PotentialDuplicateRecordArray }
     *     
     */
    public PotentialDuplicateRecordArray getPotentialDuplicates() {
        return potentialDuplicates;
    }

    /**
     * Sets the value of the potentialDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotentialDuplicateRecordArray }
     *     
     */
    public void setPotentialDuplicates(PotentialDuplicateRecordArray value) {
        this.potentialDuplicates = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

}
