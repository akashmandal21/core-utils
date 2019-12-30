package com.stanzaliving.documentgenerator.client;

import java.io.Serializable;

public class AddressTestData implements Serializable{

	
	private static final long serialVersionUID = 90891L;

	private String zipCode;
	private String street;
	private String city;
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public AddressTestData() {
		super();
	}
	
	public AddressTestData(String zipCode, String street, String city) {
		super();
		this.zipCode = zipCode;
		this.street = street;
		this.city = city;
	}
		
}
