package com.stanzaliving.core.inventory_transformations.model;

import javax.persistence.*;


@Entity
@Table(name = "CITY_LEVEL_MAX_DISCOUNT")
public class CityLevelMaxDiscount {

	@Id
	@GeneratedValue
	@Column(name="CITY_LEVEL_MAX_DISCOUNT_ID")
	private int cityLevelMaxDiscountId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CITY_ID")
	private City city;
	
	@Column(name="MAX_DISCOUNT_ALLOWED")
	private double maxDiscountAllowed;
	
	public int getCityLevelMaxDiscountId() {
		return cityLevelMaxDiscountId;
	}

	public void setCityLevelMaxDiscountId(int cityLevelMaxDiscountId) {
		this.cityLevelMaxDiscountId = cityLevelMaxDiscountId;
	}
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public double getMaxDiscountAllowed() {
		return maxDiscountAllowed;
	}

	public void setMaxDiscountAllowed(double maxDiscountAllowed) {
		this.maxDiscountAllowed = maxDiscountAllowed;
	}

	
}
