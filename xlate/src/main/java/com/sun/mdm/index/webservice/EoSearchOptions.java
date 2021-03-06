
package com.sun.mdm.index.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eoSearchOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eoSearchOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterDeactivatedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filterMergedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxElements" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="minimumWeight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="queryTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="searchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="simulateMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eoSearchOptions", propOrder = {
    "filterDeactivatedRecords",
    "filterMergedRecords",
    "maxElements",
    "minimumWeight",
    "queryTimeout",
    "searchId",
    "simulateMatch"
})
public class EoSearchOptions {

    protected boolean filterDeactivatedRecords;
    protected boolean filterMergedRecords;
    protected int maxElements;
    protected Float minimumWeight;
    protected int queryTimeout;
    protected String searchId;
    protected boolean simulateMatch;

    /**
     * Gets the value of the filterDeactivatedRecords property.
     * 
     */
    public boolean isFilterDeactivatedRecords() {
        return filterDeactivatedRecords;
    }

    /**
     * Sets the value of the filterDeactivatedRecords property.
     * 
     */
    public void setFilterDeactivatedRecords(boolean value) {
        this.filterDeactivatedRecords = value;
    }

    /**
     * Gets the value of the filterMergedRecords property.
     * 
     */
    public boolean isFilterMergedRecords() {
        return filterMergedRecords;
    }

    /**
     * Sets the value of the filterMergedRecords property.
     * 
     */
    public void setFilterMergedRecords(boolean value) {
        this.filterMergedRecords = value;
    }

    /**
     * Gets the value of the maxElements property.
     * 
     */
    public int getMaxElements() {
        return maxElements;
    }

    /**
     * Sets the value of the maxElements property.
     * 
     */
    public void setMaxElements(int value) {
        this.maxElements = value;
    }

    /**
     * Gets the value of the minimumWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumWeight() {
        return minimumWeight;
    }

    /**
     * Sets the value of the minimumWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumWeight(Float value) {
        this.minimumWeight = value;
    }

    /**
     * Gets the value of the queryTimeout property.
     * 
     */
    public int getQueryTimeout() {
        return queryTimeout;
    }

    /**
     * Sets the value of the queryTimeout property.
     * 
     */
    public void setQueryTimeout(int value) {
        this.queryTimeout = value;
    }

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * Gets the value of the simulateMatch property.
     * 
     */
    public boolean isSimulateMatch() {
        return simulateMatch;
    }

    /**
     * Sets the value of the simulateMatch property.
     * 
     */
    public void setSimulateMatch(boolean value) {
        this.simulateMatch = value;
    }

}
