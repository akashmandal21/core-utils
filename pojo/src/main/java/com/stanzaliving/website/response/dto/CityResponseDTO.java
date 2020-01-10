package com.stanzaliving.website.response.dto;

public class CityResponseDTO {

	private int cityId;

	private String name;

	private String code;

	private String iconImageUrl;

	private String seoTitle;

	private String seoDescription;

	private int websiteDisplayOrder;

	private double latitude;

	private double longitude;

	private boolean enabled;

	private String slug;

	private String cityResidenceTypeText;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIconImageUrl() {
		return iconImageUrl;
	}

	public void setIconImageUrl(String iconImageUrl) {
		this.iconImageUrl = iconImageUrl;
	}

	public int getWebsiteDisplayOrder() {
		return websiteDisplayOrder;
	}

	public void setWebsiteDisplayOrder(int websiteDisplayOrder) {
		this.websiteDisplayOrder = websiteDisplayOrder;
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

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	public String getCityResidenceTypeText() {
		return cityResidenceTypeText;
	}

	public void setCityResidenceTypeText(String cityResidenceTypeText) {
		this.cityResidenceTypeText = cityResidenceTypeText;
	}

}
