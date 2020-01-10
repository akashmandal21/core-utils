package com.stanzaliving.website.response.dto;

public class MicromarketResponseDTO {
	
	private int micromarketId;
	
	private String name;
	
	private int cityId;
	
	private String cityName;

	private double latitude;
	
	private double longitude;
	
	private String slug;
	
	private boolean enabled = true;
	
	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
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

	public int getMicromarketId() {
		return micromarketId;
	}

	public void setMicromarketId(int micromarketId) {
		this.micromarketId = micromarketId;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "MicromarketResponseDTO [micromarketId=" + micromarketId + ", name=" + name + ", cityId=" + cityId + ", cityName=" + cityName + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", slug=" + slug + ", enabled=" + enabled + "]";
	}

}
