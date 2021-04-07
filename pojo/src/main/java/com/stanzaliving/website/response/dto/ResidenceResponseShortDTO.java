package com.stanzaliving.website.response.dto;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import com.stanzaliving.website.enums.Gender;

public class ResidenceResponseShortDTO {

	private int residenceId;

	private String name;

	private Gender gender;

	private int micromarketId;

	private String micromarketName;

	private String micromarketSlug;

	private int cityId;

	private String cityName;

	private String citySlug;

	private Set<ResidenceOccupancyResponseDTO> residenceOccupancies = new HashSet<>(0);

	private Set<ImageResponseDTO> images = new HashSet<>(0);

	private AddressResponseDTO address;

	private String description;

	private String seoTitle;

	private String seoDescription;

	private String pricingPlan;

	private int startingPrice;

	private double latitude;

	private double longitude;

	private boolean enabled;

	private String slug;

	private Integer fomoBedCount;
	
	private Double distanceFromPlace;

	private Integer preBookingAmount;
	
	private String preBookingMode;
	
	private Set<FacilityResponseDTO> facilites = new HashSet<>(0);
	
	private String facilitesSortedString;
	
	private String googleMapLink;
	
	private Integer sortOrder;
	
	private boolean soldOut;
	
	private String virtualTourImage;
	
	private String fomoTag;
	
	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}
	
	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public int getResidenceId() {
		return residenceId;
	}

	public void setResidenceId(int residenceId) {
		this.residenceId = residenceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getMicromarketId() {
		return micromarketId;
	}

	public void setMicromarketId(int micromarketId) {
		this.micromarketId = micromarketId;
	}

	public String getMicromarketName() {
		return micromarketName;
	}

	public void setMicromarketName(String micromarketName) {
		this.micromarketName = micromarketName;
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

	public Set<ResidenceOccupancyResponseDTO> getResidenceOccupancies() {
		TreeSet<ResidenceOccupancyResponseDTO> occupancyComp = new TreeSet<ResidenceOccupancyResponseDTO>(new Comparator<ResidenceOccupancyResponseDTO>() {

			@Override
			public int compare(ResidenceOccupancyResponseDTO o1, ResidenceOccupancyResponseDTO o2) {
				if (o1.getOccupancyOccupancy() > o2.getOccupancyOccupancy()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		
		System.out.println(residenceOccupancies);
		if(Objects.nonNull(residenceOccupancies)) {
			occupancyComp.addAll(residenceOccupancies);
		}
		return occupancyComp;
	}

	public void setResidenceOccupancies(Set<ResidenceOccupancyResponseDTO> residenceOccupancies) {
		this.residenceOccupancies = residenceOccupancies;
	}

	public Set<ImageResponseDTO> getImages() {
		TreeSet<ImageResponseDTO> imagesComp = new TreeSet<ImageResponseDTO>(new Comparator<ImageResponseDTO>() {

			@Override
			public int compare(ImageResponseDTO o1, ImageResponseDTO o2) {
				if (o1.getImageOrder() > o2.getImageOrder()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		imagesComp.addAll(images);
		return imagesComp;
	}

	public void setImages(Set<ImageResponseDTO> images) {
		this.images = images;
	}

	public int getStartingPrice() {
		return startingPrice;
	}

	public void setStartingPrice(int startingPrice) {
		this.startingPrice = startingPrice;
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

	public AddressResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseDTO address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPricingPlan() {
		return pricingPlan;
	}

	public void setPricingPlan(String pricingPlan) {
		this.pricingPlan = pricingPlan;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getMicromarketSlug() {
		return micromarketSlug;
	}

	public void setMicromarketSlug(String micromarketSlug) {
		this.micromarketSlug = micromarketSlug;
	}

	public String getCitySlug() {
		return citySlug;
	}

	public void setCitySlug(String citySlug) {
		this.citySlug = citySlug;
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

	public Integer getFomoBedCount() {
		return fomoBedCount;
	}

	public void setFomoBedCount(Integer fomoBedCount) {
		this.fomoBedCount = fomoBedCount;
	}

	public Double getDistanceFromPlace() {
		return distanceFromPlace;
	}

	public void setDistanceFromPlace(Double distanceFromPlace) {
		this.distanceFromPlace = distanceFromPlace;
	}

	public Integer getPreBookingAmount() {
		return preBookingAmount;
	}

	public void setPreBookingAmount(Integer preBookingAmount) {
		this.preBookingAmount = preBookingAmount;
	}

	public String getPreBookingMode() {
		return preBookingMode;
	}

	public void setPreBookingMode(String preBookingMode) {
		this.preBookingMode = preBookingMode;
	}

	public Set<FacilityResponseDTO> getFacilites() {
		return facilites;
	}

	public void setFacilites(Set<FacilityResponseDTO> facilites) {
		this.facilites = facilites;
	}

	public String getFacilitesSortedString() {
		return facilitesSortedString;
	}

	public void setFacilitesSortedString(String facilitesSortedString) {
		this.facilitesSortedString = facilitesSortedString;
	}

	public String getGoogleMapLink() {
		return googleMapLink;
	}

	public void setGoogleMapLink(String googleMapLink) {
		this.googleMapLink = googleMapLink;
	}

	public String getVirtualTourImage() {
		return virtualTourImage;
	}

	public void setVirtualTourImage(String virtualTourImage) {
		this.virtualTourImage = virtualTourImage;
	}

	public String getFomoTag() {
		return fomoTag;
	}

	public void setFomoTag(String fomoTag) {
		this.fomoTag = fomoTag;
	}
}
