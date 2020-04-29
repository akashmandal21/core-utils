package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESIDENCE_HSC_CODES")
public class ResidenceHSCCodes {
	
	@Id
	@Column(name = "PROPERTY_TYPE")
	private PropertyType propertyType;
	
	@Column(name = "HSC_RENTAL")
	private String hscRental;
	
	@Column(name = "HSC_SERVICES")
	private String hscServices;

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getHscRental() {
		return hscRental;
	}

	public void setHscRental(String hscRental) {
		this.hscRental = hscRental;
	}

	public String getHscServices() {
		return hscServices;
	}

	public void setHscServices(String hscServices) {
		this.hscServices = hscServices;
	}

}
