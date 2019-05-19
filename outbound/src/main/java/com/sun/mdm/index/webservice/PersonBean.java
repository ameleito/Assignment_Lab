
package com.sun.mdm.index.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://webservice.index.mdm.sun.com/}addressBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressHistory" type="{http://webservice.index.mdm.sun.com/}addressHistoryBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alias" type="{http://webservice.index.mdm.sun.com/}aliasBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="authFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auxId" type="{http://webservice.index.mdm.sun.com/}auxIdBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="birthOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="citizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="class5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://webservice.index.mdm.sun.com/}commentBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://webservice.index.mdm.sun.com/}contactBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="death" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deathCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driversLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driversLicenseExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driversLicenseSt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dummyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://webservice.index.mdm.sun.com/}emailBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ethnic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatherPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="images" type="{http://webservice.index.mdm.sun.com/}imagesBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastServiceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lgaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maiden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maidenPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="militaryBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="militaryRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="militaryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherMNPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="motherPhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multipleBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pensionExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pensionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personCatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://webservice.index.mdm.sun.com/}phoneBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="phoneHistory" type="{http://webservice.index.mdm.sun.com/}phoneHistoryBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pobCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pobCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pobState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="races" type="{http://webservice.index.mdm.sun.com/}racesBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repatriationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spousePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="string9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIPFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personBean", propOrder = {
    "address",
    "addressHistory",
    "alias",
    "authFlag",
    "auxId",
    "birthOrder",
    "citizenship",
    "class1",
    "class2",
    "class3",
    "class4",
    "class5",
    "comment",
    "contact",
    "dob",
    "date1",
    "date2",
    "date3",
    "date4",
    "date5",
    "death",
    "deathCertificate",
    "degree",
    "districtOfResidence",
    "dod",
    "driversLicense",
    "driversLicenseExp",
    "driversLicenseSt",
    "dummyDate",
    "email",
    "ethnic",
    "fatherName",
    "fatherPhoneticCode",
    "firstName",
    "fnamePhoneticCode",
    "gender",
    "images",
    "language",
    "lastName",
    "lastServiceDate",
    "lgaCode",
    "lnamePhoneticCode",
    "mStatus",
    "maiden",
    "maidenPhoneticCode",
    "middleName",
    "militaryBranch",
    "militaryRank",
    "militaryStatus",
    "mnamePhoneticCode",
    "motherMN",
    "motherMNPhoneticCode",
    "motherName",
    "motherPhoneticCode",
    "multipleBirth",
    "nationality",
    "pensionExpDate",
    "pensionNo",
    "personCatCode",
    "personId",
    "phone",
    "phoneHistory",
    "picture",
    "pobCity",
    "pobCountry",
    "pobState",
    "prefix",
    "race",
    "races",
    "religion",
    "repatriationNo",
    "ssn",
    "ssn4",
    "spouseName",
    "spousePhoneticCode",
    "stdFirstName",
    "stdLastName",
    "stdMiddleName",
    "string1",
    "string10",
    "string2",
    "string3",
    "string4",
    "string5",
    "string6",
    "string7",
    "string8",
    "string9",
    "suffix",
    "title",
    "vipFlag",
    "vetStatus"
})
public class PersonBean {

    @XmlElement(nillable = true)
    protected List<AddressBean> address;
    @XmlElement(nillable = true)
    protected List<AddressHistoryBean> addressHistory;
    @XmlElement(nillable = true)
    protected List<AliasBean> alias;
    protected String authFlag;
    @XmlElement(nillable = true)
    protected List<AuxIdBean> auxId;
    protected String birthOrder;
    protected String citizenship;
    protected String class1;
    protected String class2;
    protected String class3;
    protected String class4;
    protected String class5;
    @XmlElement(nillable = true)
    protected List<CommentBean> comment;
    @XmlElement(nillable = true)
    protected List<ContactBean> contact;
    @XmlElement(name = "DOB")
    protected String dob;
    protected String date1;
    protected String date2;
    protected String date3;
    protected String date4;
    protected String date5;
    protected String death;
    protected String deathCertificate;
    protected String degree;
    protected String districtOfResidence;
    protected String dod;
    protected String driversLicense;
    protected String driversLicenseExp;
    protected String driversLicenseSt;
    protected String dummyDate;
    @XmlElement(nillable = true)
    protected List<EmailBean> email;
    protected String ethnic;
    protected String fatherName;
    protected String fatherPhoneticCode;
    protected String firstName;
    protected String fnamePhoneticCode;
    protected String gender;
    @XmlElement(nillable = true)
    protected List<ImagesBean> images;
    protected String language;
    protected String lastName;
    protected String lastServiceDate;
    protected String lgaCode;
    protected String lnamePhoneticCode;
    @XmlElement(name = "MStatus")
    protected String mStatus;
    protected String maiden;
    protected String maidenPhoneticCode;
    protected String middleName;
    protected String militaryBranch;
    protected String militaryRank;
    protected String militaryStatus;
    protected String mnamePhoneticCode;
    protected String motherMN;
    protected String motherMNPhoneticCode;
    protected String motherName;
    protected String motherPhoneticCode;
    protected String multipleBirth;
    protected String nationality;
    protected String pensionExpDate;
    protected String pensionNo;
    protected String personCatCode;
    protected String personId;
    @XmlElement(nillable = true)
    protected List<PhoneBean> phone;
    @XmlElement(nillable = true)
    protected List<PhoneHistoryBean> phoneHistory;
    protected String picture;
    protected String pobCity;
    protected String pobCountry;
    protected String pobState;
    protected String prefix;
    protected String race;
    @XmlElement(nillable = true)
    protected List<RacesBean> races;
    protected String religion;
    protected String repatriationNo;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "SSN4")
    protected String ssn4;
    protected String spouseName;
    protected String spousePhoneticCode;
    protected String stdFirstName;
    protected String stdLastName;
    protected String stdMiddleName;
    protected String string1;
    protected String string10;
    protected String string2;
    protected String string3;
    protected String string4;
    protected String string5;
    protected String string6;
    protected String string7;
    protected String string8;
    protected String string9;
    protected String suffix;
    protected String title;
    @XmlElement(name = "VIPFlag")
    protected String vipFlag;
    protected String vetStatus;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressBean }
     * 
     * 
     */
    public List<AddressBean> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressBean>();
        }
        return this.address;
    }

    /**
     * Gets the value of the addressHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressHistoryBean }
     * 
     * 
     */
    public List<AddressHistoryBean> getAddressHistory() {
        if (addressHistory == null) {
            addressHistory = new ArrayList<AddressHistoryBean>();
        }
        return this.addressHistory;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AliasBean }
     * 
     * 
     */
    public List<AliasBean> getAlias() {
        if (alias == null) {
            alias = new ArrayList<AliasBean>();
        }
        return this.alias;
    }

    /**
     * Gets the value of the authFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthFlag() {
        return authFlag;
    }

    /**
     * Sets the value of the authFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthFlag(String value) {
        this.authFlag = value;
    }

    /**
     * Gets the value of the auxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuxIdBean }
     * 
     * 
     */
    public List<AuxIdBean> getAuxId() {
        if (auxId == null) {
            auxId = new ArrayList<AuxIdBean>();
        }
        return this.auxId;
    }

    /**
     * Gets the value of the birthOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthOrder() {
        return birthOrder;
    }

    /**
     * Sets the value of the birthOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthOrder(String value) {
        this.birthOrder = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the class1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass1() {
        return class1;
    }

    /**
     * Sets the value of the class1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass1(String value) {
        this.class1 = value;
    }

    /**
     * Gets the value of the class2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass2() {
        return class2;
    }

    /**
     * Sets the value of the class2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass2(String value) {
        this.class2 = value;
    }

    /**
     * Gets the value of the class3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass3() {
        return class3;
    }

    /**
     * Sets the value of the class3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass3(String value) {
        this.class3 = value;
    }

    /**
     * Gets the value of the class4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass4() {
        return class4;
    }

    /**
     * Sets the value of the class4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass4(String value) {
        this.class4 = value;
    }

    /**
     * Gets the value of the class5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass5() {
        return class5;
    }

    /**
     * Sets the value of the class5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass5(String value) {
        this.class5 = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentBean }
     * 
     * 
     */
    public List<CommentBean> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentBean>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactBean }
     * 
     * 
     */
    public List<ContactBean> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactBean>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the date1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate1() {
        return date1;
    }

    /**
     * Sets the value of the date1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate1(String value) {
        this.date1 = value;
    }

    /**
     * Gets the value of the date2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate2() {
        return date2;
    }

    /**
     * Sets the value of the date2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate2(String value) {
        this.date2 = value;
    }

    /**
     * Gets the value of the date3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate3() {
        return date3;
    }

    /**
     * Sets the value of the date3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate3(String value) {
        this.date3 = value;
    }

    /**
     * Gets the value of the date4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate4() {
        return date4;
    }

    /**
     * Sets the value of the date4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate4(String value) {
        this.date4 = value;
    }

    /**
     * Gets the value of the date5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate5() {
        return date5;
    }

    /**
     * Sets the value of the date5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate5(String value) {
        this.date5 = value;
    }

    /**
     * Gets the value of the death property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeath() {
        return death;
    }

    /**
     * Sets the value of the death property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeath(String value) {
        this.death = value;
    }

    /**
     * Gets the value of the deathCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathCertificate() {
        return deathCertificate;
    }

    /**
     * Sets the value of the deathCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathCertificate(String value) {
        this.deathCertificate = value;
    }

    /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Sets the value of the degree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    /**
     * Gets the value of the districtOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictOfResidence() {
        return districtOfResidence;
    }

    /**
     * Sets the value of the districtOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictOfResidence(String value) {
        this.districtOfResidence = value;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDod(String value) {
        this.dod = value;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicense(String value) {
        this.driversLicense = value;
    }

    /**
     * Gets the value of the driversLicenseExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseExp() {
        return driversLicenseExp;
    }

    /**
     * Sets the value of the driversLicenseExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseExp(String value) {
        this.driversLicenseExp = value;
    }

    /**
     * Gets the value of the driversLicenseSt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseSt() {
        return driversLicenseSt;
    }

    /**
     * Sets the value of the driversLicenseSt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseSt(String value) {
        this.driversLicenseSt = value;
    }

    /**
     * Gets the value of the dummyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDummyDate() {
        return dummyDate;
    }

    /**
     * Sets the value of the dummyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDummyDate(String value) {
        this.dummyDate = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailBean }
     * 
     * 
     */
    public List<EmailBean> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailBean>();
        }
        return this.email;
    }

    /**
     * Gets the value of the ethnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * Sets the value of the ethnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnic(String value) {
        this.ethnic = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the fatherPhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherPhoneticCode() {
        return fatherPhoneticCode;
    }

    /**
     * Sets the value of the fatherPhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherPhoneticCode(String value) {
        this.fatherPhoneticCode = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnamePhoneticCode() {
        return fnamePhoneticCode;
    }

    /**
     * Sets the value of the fnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnamePhoneticCode(String value) {
        this.fnamePhoneticCode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImagesBean }
     * 
     * 
     */
    public List<ImagesBean> getImages() {
        if (images == null) {
            images = new ArrayList<ImagesBean>();
        }
        return this.images;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastServiceDate() {
        return lastServiceDate;
    }

    /**
     * Sets the value of the lastServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastServiceDate(String value) {
        this.lastServiceDate = value;
    }

    /**
     * Gets the value of the lgaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgaCode() {
        return lgaCode;
    }

    /**
     * Sets the value of the lgaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgaCode(String value) {
        this.lgaCode = value;
    }

    /**
     * Gets the value of the lnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnamePhoneticCode() {
        return lnamePhoneticCode;
    }

    /**
     * Sets the value of the lnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnamePhoneticCode(String value) {
        this.lnamePhoneticCode = value;
    }

    /**
     * Gets the value of the mStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMStatus() {
        return mStatus;
    }

    /**
     * Sets the value of the mStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMStatus(String value) {
        this.mStatus = value;
    }

    /**
     * Gets the value of the maiden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaiden() {
        return maiden;
    }

    /**
     * Sets the value of the maiden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaiden(String value) {
        this.maiden = value;
    }

    /**
     * Gets the value of the maidenPhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenPhoneticCode() {
        return maidenPhoneticCode;
    }

    /**
     * Sets the value of the maidenPhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenPhoneticCode(String value) {
        this.maidenPhoneticCode = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the militaryBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryBranch() {
        return militaryBranch;
    }

    /**
     * Sets the value of the militaryBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryBranch(String value) {
        this.militaryBranch = value;
    }

    /**
     * Gets the value of the militaryRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryRank() {
        return militaryRank;
    }

    /**
     * Sets the value of the militaryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryRank(String value) {
        this.militaryRank = value;
    }

    /**
     * Gets the value of the militaryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryStatus() {
        return militaryStatus;
    }

    /**
     * Sets the value of the militaryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryStatus(String value) {
        this.militaryStatus = value;
    }

    /**
     * Gets the value of the mnamePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnamePhoneticCode() {
        return mnamePhoneticCode;
    }

    /**
     * Sets the value of the mnamePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnamePhoneticCode(String value) {
        this.mnamePhoneticCode = value;
    }

    /**
     * Gets the value of the motherMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMN() {
        return motherMN;
    }

    /**
     * Sets the value of the motherMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMN(String value) {
        this.motherMN = value;
    }

    /**
     * Gets the value of the motherMNPhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMNPhoneticCode() {
        return motherMNPhoneticCode;
    }

    /**
     * Sets the value of the motherMNPhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMNPhoneticCode(String value) {
        this.motherMNPhoneticCode = value;
    }

    /**
     * Gets the value of the motherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Sets the value of the motherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherName(String value) {
        this.motherName = value;
    }

    /**
     * Gets the value of the motherPhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherPhoneticCode() {
        return motherPhoneticCode;
    }

    /**
     * Sets the value of the motherPhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherPhoneticCode(String value) {
        this.motherPhoneticCode = value;
    }

    /**
     * Gets the value of the multipleBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleBirth() {
        return multipleBirth;
    }

    /**
     * Sets the value of the multipleBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleBirth(String value) {
        this.multipleBirth = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the pensionExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionExpDate() {
        return pensionExpDate;
    }

    /**
     * Sets the value of the pensionExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionExpDate(String value) {
        this.pensionExpDate = value;
    }

    /**
     * Gets the value of the pensionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionNo() {
        return pensionNo;
    }

    /**
     * Sets the value of the pensionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionNo(String value) {
        this.pensionNo = value;
    }

    /**
     * Gets the value of the personCatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCatCode() {
        return personCatCode;
    }

    /**
     * Sets the value of the personCatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCatCode(String value) {
        this.personCatCode = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneBean }
     * 
     * 
     */
    public List<PhoneBean> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneBean>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the phoneHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneHistoryBean }
     * 
     * 
     */
    public List<PhoneHistoryBean> getPhoneHistory() {
        if (phoneHistory == null) {
            phoneHistory = new ArrayList<PhoneHistoryBean>();
        }
        return this.phoneHistory;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    /**
     * Gets the value of the pobCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobCity() {
        return pobCity;
    }

    /**
     * Sets the value of the pobCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobCity(String value) {
        this.pobCity = value;
    }

    /**
     * Gets the value of the pobCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobCountry() {
        return pobCountry;
    }

    /**
     * Sets the value of the pobCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobCountry(String value) {
        this.pobCountry = value;
    }

    /**
     * Gets the value of the pobState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobState() {
        return pobState;
    }

    /**
     * Sets the value of the pobState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobState(String value) {
        this.pobState = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Gets the value of the races property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the races property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RacesBean }
     * 
     * 
     */
    public List<RacesBean> getRaces() {
        if (races == null) {
            races = new ArrayList<RacesBean>();
        }
        return this.races;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    /**
     * Gets the value of the repatriationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepatriationNo() {
        return repatriationNo;
    }

    /**
     * Sets the value of the repatriationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepatriationNo(String value) {
        this.repatriationNo = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the ssn4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN4() {
        return ssn4;
    }

    /**
     * Sets the value of the ssn4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN4(String value) {
        this.ssn4 = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Gets the value of the spousePhoneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpousePhoneticCode() {
        return spousePhoneticCode;
    }

    /**
     * Sets the value of the spousePhoneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpousePhoneticCode(String value) {
        this.spousePhoneticCode = value;
    }

    /**
     * Gets the value of the stdFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdFirstName() {
        return stdFirstName;
    }

    /**
     * Sets the value of the stdFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdFirstName(String value) {
        this.stdFirstName = value;
    }

    /**
     * Gets the value of the stdLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdLastName() {
        return stdLastName;
    }

    /**
     * Sets the value of the stdLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdLastName(String value) {
        this.stdLastName = value;
    }

    /**
     * Gets the value of the stdMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdMiddleName() {
        return stdMiddleName;
    }

    /**
     * Sets the value of the stdMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdMiddleName(String value) {
        this.stdMiddleName = value;
    }

    /**
     * Gets the value of the string1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString1() {
        return string1;
    }

    /**
     * Sets the value of the string1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString1(String value) {
        this.string1 = value;
    }

    /**
     * Gets the value of the string10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString10() {
        return string10;
    }

    /**
     * Sets the value of the string10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString10(String value) {
        this.string10 = value;
    }

    /**
     * Gets the value of the string2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString2() {
        return string2;
    }

    /**
     * Sets the value of the string2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString2(String value) {
        this.string2 = value;
    }

    /**
     * Gets the value of the string3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString3() {
        return string3;
    }

    /**
     * Sets the value of the string3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString3(String value) {
        this.string3 = value;
    }

    /**
     * Gets the value of the string4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString4() {
        return string4;
    }

    /**
     * Sets the value of the string4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString4(String value) {
        this.string4 = value;
    }

    /**
     * Gets the value of the string5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString5() {
        return string5;
    }

    /**
     * Sets the value of the string5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString5(String value) {
        this.string5 = value;
    }

    /**
     * Gets the value of the string6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString6() {
        return string6;
    }

    /**
     * Sets the value of the string6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString6(String value) {
        this.string6 = value;
    }

    /**
     * Gets the value of the string7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString7() {
        return string7;
    }

    /**
     * Sets the value of the string7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString7(String value) {
        this.string7 = value;
    }

    /**
     * Gets the value of the string8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString8() {
        return string8;
    }

    /**
     * Sets the value of the string8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString8(String value) {
        this.string8 = value;
    }

    /**
     * Gets the value of the string9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString9() {
        return string9;
    }

    /**
     * Sets the value of the string9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString9(String value) {
        this.string9 = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the vipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPFlag() {
        return vipFlag;
    }

    /**
     * Sets the value of the vipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPFlag(String value) {
        this.vipFlag = value;
    }

    /**
     * Gets the value of the vetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetStatus() {
        return vetStatus;
    }

    /**
     * Sets the value of the vetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetStatus(String value) {
        this.vetStatus = value;
    }

}
