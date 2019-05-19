
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for potentialDuplicateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="potentialDuplicateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="createUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resolvedComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resolvedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="resolvedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="systemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potentialDuplicateResult", propOrder = {
    "comparisonId",
    "createDate",
    "createUser",
    "euid1",
    "euid2",
    "id",
    "resolvedComment",
    "resolvedDate",
    "resolvedUser",
    "status",
    "systemCode",
    "weight"
})
public class PotentialDuplicateResult {

    protected long comparisonId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected String createUser;
    @XmlElement(name = "EUID1")
    protected String euid1;
    @XmlElement(name = "EUID2")
    protected String euid2;
    protected String id;
    protected String resolvedComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolvedDate;
    protected String resolvedUser;
    protected String status;
    protected String systemCode;
    protected float weight;

    /**
     * Gets the value of the comparisonId property.
     * 
     */
    public long getComparisonId() {
        return comparisonId;
    }

    /**
     * Sets the value of the comparisonId property.
     * 
     */
    public void setComparisonId(long value) {
        this.comparisonId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the createUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the euid1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID1() {
        return euid1;
    }

    /**
     * Sets the value of the euid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID1(String value) {
        this.euid1 = value;
    }

    /**
     * Gets the value of the euid2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID2() {
        return euid2;
    }

    /**
     * Sets the value of the euid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID2(String value) {
        this.euid2 = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the resolvedComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolvedComment() {
        return resolvedComment;
    }

    /**
     * Sets the value of the resolvedComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvedComment(String value) {
        this.resolvedComment = value;
    }

    /**
     * Gets the value of the resolvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolvedDate() {
        return resolvedDate;
    }

    /**
     * Sets the value of the resolvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolvedDate(XMLGregorianCalendar value) {
        this.resolvedDate = value;
    }

    /**
     * Gets the value of the resolvedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolvedUser() {
        return resolvedUser;
    }

    /**
     * Sets the value of the resolvedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvedUser(String value) {
        this.resolvedUser = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

}
