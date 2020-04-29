package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ADDRESSS")
public class Address {
	
	@Id()
	@GeneratedValue
	@Column(name="ADDRESS_ID")
	private int addressId;
	
	@Column(name="LINE_1")
	private String line1;
	
	@Column(name="LINE_2")
	private String line2;
	
	@Column(name="LANDMARK",nullable=true)
	private String landmark;
	
	@Column(name="ZIPCODE",nullable=false, length=6)
	private int zipCode;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=true)
	@JoinColumn(name="STATE_ID")
	private State state;
	
	@ManyToOne(fetch=FetchType.EAGER, optional=true)
	@JoinColumn(name="CITY_ID")
	private City city;
	
	@Column(name="LATITUDE")
	private double latitude;
	
	@Column(name="LONGITUDE")
	private double longitude;
	
	@Column(name="CREATED", nullable=false)
	private Date created = new Date();
	
	@Column(name="UPDATED", nullable=false)
	private Date updated = new Date();
	
	@Column(name="ENABLED", nullable=false)
	private boolean enabled = true;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return line1 + " " + line2 + ", "+ city.getName() + "-"+ zipCode;
	}
	
	
	
}
