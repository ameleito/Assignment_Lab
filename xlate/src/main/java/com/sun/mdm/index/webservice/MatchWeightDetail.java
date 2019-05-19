
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchWeightDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matchWeightDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matchFunctionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchFunctionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="matchFunctionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "matchWeightDetail", propOrder = {
    "matchFunctionDescription",
    "matchFunctionId",
    "matchFunctionName",
    "value1",
    "value2",
    "weight"
})
public class MatchWeightDetail {

    protected String matchFunctionDescription;
    protected long matchFunctionId;
    protected String matchFunctionName;
    protected String value1;
    protected String value2;
    protected float weight;

    /**
     * Gets the value of the matchFunctionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchFunctionDescription() {
        return matchFunctionDescription;
    }

    /**
     * Sets the value of the matchFunctionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchFunctionDescription(String value) {
        this.matchFunctionDescription = value;
    }

    /**
     * Gets the value of the matchFunctionId property.
     * 
     */
    public long getMatchFunctionId() {
        return matchFunctionId;
    }

    /**
     * Sets the value of the matchFunctionId property.
     * 
     */
    public void setMatchFunctionId(long value) {
        this.matchFunctionId = value;
    }

    /**
     * Gets the value of the matchFunctionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchFunctionName() {
        return matchFunctionName;
    }

    /**
     * Sets the value of the matchFunctionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchFunctionName(String value) {
        this.matchFunctionName = value;
    }

    /**
     * Gets the value of the value1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue1() {
        return value1;
    }

    /**
     * Sets the value of the value1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue1(String value) {
        this.value1 = value;
    }

    /**
     * Gets the value of the value2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue2() {
        return value2;
    }

    /**
     * Sets the value of the value2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue2(String value) {
        this.value2 = value;
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
