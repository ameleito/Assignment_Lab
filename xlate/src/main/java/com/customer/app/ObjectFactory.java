package com.customer.app;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory  {
	 public Persons createPersons() {
	        return new Persons();
	    }
	 
	 public Person createPerson() {
	        return new Person();
	    }
}
