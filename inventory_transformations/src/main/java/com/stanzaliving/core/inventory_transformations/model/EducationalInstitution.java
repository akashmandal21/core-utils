package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EDUCATIONAL_INSTITUTION")
public class EducationalInstitution {

	@Id()
	@GeneratedValue
	@Column(name = "EDUCATIONAL_INSTITUTION_ID")
	private int educationalInstitutionId;

	@Column(name = "NAME", nullable = false)
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CITY_ID")
	private City city;

	@Column(name = "CREATED", nullable = false)
	private Date created = new Date();

	@Column(name = "UPDATED", nullable = false)
	private Date updated = new Date();

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled = true;

	public int getEducationalInstitutionId() {
		return educationalInstitutionId;
	}

	public void setEducationalInstitutionId(int educationalInstitutionId) {
		this.educationalInstitutionId = educationalInstitutionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
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

}
