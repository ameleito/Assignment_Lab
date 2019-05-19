package com.customer.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

	@XmlElement(name = "legalname")
	private LegalName legalname;
	@XmlElement(name = "fathername")
	private String fathername;
	@XmlElement(name = "gender")
	private Gender gender;

	public LegalName getLegalname() {
		return legalname;
	}
	public void setLegalname(LegalName legalname) {
		this.legalname = legalname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}


}
