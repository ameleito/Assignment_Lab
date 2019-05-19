
package com.sun.mdm.index.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchWeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matchWeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="falsePositiveMessages" type="{http://webservice.index.mdm.sun.com/}falsePositiveMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchWeightDetails" type="{http://webservice.index.mdm.sun.com/}matchWeightDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "matchWeight", propOrder = {
    "falsePositiveMessages",
    "matchWeightDetails",
    "weight"
})
public class MatchWeight {

    @XmlElement(nillable = true)
    protected List<FalsePositiveMessage> falsePositiveMessages;
    @XmlElement(nillable = true)
    protected List<MatchWeightDetail> matchWeightDetails;
    protected float weight;

    /**
     * Gets the value of the falsePositiveMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the falsePositiveMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFalsePositiveMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FalsePositiveMessage }
     * 
     * 
     */
    public List<FalsePositiveMessage> getFalsePositiveMessages() {
        if (falsePositiveMessages == null) {
            falsePositiveMessages = new ArrayList<FalsePositiveMessage>();
        }
        return this.falsePositiveMessages;
    }

    /**
     * Gets the value of the matchWeightDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchWeightDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchWeightDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchWeightDetail }
     * 
     * 
     */
    public List<MatchWeightDetail> getMatchWeightDetails() {
        if (matchWeightDetails == null) {
            matchWeightDetails = new ArrayList<MatchWeightDetail>();
        }
        return this.matchWeightDetails;
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
