package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CITY_POLICE_VERIFICATION")
public class CityPoliceVerification {

	@Id
	@Column(name = "POLICE_VERIFICATION_ID")
	private int policeVerificationId;
	
	@MapsId
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional=true)
	@JoinColumn(name="CITY_ID")
	private City city;
	
	@Column(name = "FORM_URL")
	private String formUrl;
	
	@Column(name = "CREATED")
	private Date created;
	
	@Column(name = "UPDATED")
	private Date updated;

	public int getPoliceVerificationId() {
		return policeVerificationId;
	}

	public void setPoliceVerificationId(int policeVerificationId) {
		this.policeVerificationId = policeVerificationId;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getFormUrl() {
		return formUrl;
	}

	public void setFormUrl(String formUrl) {
		this.formUrl = formUrl;
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
	
}