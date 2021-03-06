package com.customer.app;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="persons")
public class Persons {

	@XmlElement(name = "person")
	private ArrayList<Person> persons;

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersonas(ArrayList<Person> persons) {
		this.persons = persons;
	}
	
	

}
