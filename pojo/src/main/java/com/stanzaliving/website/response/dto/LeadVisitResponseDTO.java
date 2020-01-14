package com.stanzaliving.website.response.dto;

/**
 * @author nipunaggarwal
 *
 */

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author nipunaggarwal
 *
 */
public class LeadVisitResponseDTO {

	private Integer leadId;
	private Date visitDate;
	private String residenceName;
	private String residenceType;
	private double latitude;
	private double longitude;
	private Set<ImageResponseDTO> images = new HashSet<>(0);
	private AddressResponseDTO address;

	public Integer getLeadId() {
		return leadId;
	}

	public void setLeadId(Integer leadId) {
		this.leadId = leadId;
	}

	public String getResidenceName() {
		return residenceName;
	}

	public void setResidenceName(String residenceName) {
		this.residenceName = residenceName;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public String getResidenceType() {
		return residenceType;
	}

	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
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

	public Set<ImageResponseDTO> getImages() {
		return images;
	}

	public void setImages(Set<ImageResponseDTO> images) {
		this.images = images;
	}

	public AddressResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseDTO address) {
		this.address = address;
	}

}
