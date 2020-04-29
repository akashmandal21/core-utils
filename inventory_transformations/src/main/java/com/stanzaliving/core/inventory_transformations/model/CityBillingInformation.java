package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CITY_BILLING_INFORMATION")
public class CityBillingInformation {

	@Id()
	@GeneratedValue
	@Column(name = "CITY_BILLING_INFORMATION_ID")
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CITY_ID")
	private City city;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "GST")
	private String gst;
	
	@Column(name = "PAN")
	private String pan;
	
	@Column(name = "CIN")
	private String cin;
		
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CITY_BILLING_INFORMATION_ADDRESS_ID")
	private Address address;
	
	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();
	
	@Column(name = "REGISTERED_ADDRESS")
	private String registeredAddress;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGst() {
		return gst;
	}
	
	public void setGst(String gst) {
		this.gst = gst;
	}
	
	public String getPan() {
		return pan;
	}
	
	public void  setPan(String pan) {
		this.pan = pan;
	}
	
	public String getCin() {
		return cin;
	}
	
	public void setCin(String cin) {
		this.cin = cin;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getRegisteredAddress() {
		return registeredAddress;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	
}
