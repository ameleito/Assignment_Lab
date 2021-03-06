
package com.sun.mdm.index.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergeEnterpriseRecordWithOverwrites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergeEnterpriseRecordWithOverwrites"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="fromEUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toEUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="setSourceSystemStatusToMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="overwrite" type="{http://webservice.index.mdm.sun.com/}sbrOverWriteBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeEnterpriseRecordWithOverwrites", propOrder = {
    "callerInfo",
    "fromEUID",
    "toEUID",
    "calculateOnly",
    "setSourceSystemStatusToMerged",
    "overwrite"
})
public class MergeEnterpriseRecordWithOverwrites {

    protected CallerInfo callerInfo;
    protected String fromEUID;
    protected String toEUID;
    protected boolean calculateOnly;
    protected boolean setSourceSystemStatusToMerged;
    @XmlElement(nillable = true)
    protected List<SbrOverWriteBean> overwrite;

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
     * Gets the value of the toEUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEUID() {
        return toEUID;
    }

    /**
     * Sets the value of the toEUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEUID(String value) {
        this.toEUID = value;
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

    /**
     * Gets the value of the overwrite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overwrite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverwrite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SbrOverWriteBean }
     * 
     * 
     */
    public List<SbrOverWriteBean> getOverwrite() {
        if (overwrite == null) {
            overwrite = new ArrayList<SbrOverWriteBean>();
        }
        return this.overwrite;
    }

}
