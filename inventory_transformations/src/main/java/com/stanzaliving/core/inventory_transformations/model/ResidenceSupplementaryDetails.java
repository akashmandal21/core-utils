package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;

@Entity
@Table(name = "RESIDENCE_SUPPLEMENTARY_DETAILS")
public class ResidenceSupplementaryDetails {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "EXPIRE_DAYS", nullable = false)
	private int expireDays;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExpireDays() {
		return expireDays;
	}

	public void setExpireDays(int expireDays) {
		this.expireDays = expireDays;
	}

}
