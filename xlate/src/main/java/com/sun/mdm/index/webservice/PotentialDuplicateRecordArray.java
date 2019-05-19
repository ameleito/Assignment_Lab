
package com.sun.mdm.index.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for potentialDuplicateRecordArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="potentialDuplicateRecordArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="potentialDuplicate" type="{http://webservice.index.mdm.sun.com/}potentialDuplicateRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potentialDuplicateRecordArray", propOrder = {
    "potentialDuplicate"
})
public class PotentialDuplicateRecordArray {

    @XmlElement(nillable = true)
    protected List<PotentialDuplicateRecord> potentialDuplicate;

    /**
     * Gets the value of the potentialDuplicate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the potentialDuplicate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPotentialDuplicate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PotentialDuplicateRecord }
     * 
     * 
     */
    public List<PotentialDuplicateRecord> getPotentialDuplicate() {
        if (potentialDuplicate == null) {
            potentialDuplicate = new ArrayList<PotentialDuplicateRecord>();
        }
        return this.potentialDuplicate;
    }

}
