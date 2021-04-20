package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentDetailedResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer apartmentId;
	
	private String propertyCode;
	
	private Integer roomCount;
	
	private String apartmentName;
	
	private String apartmentSlug;
	
	private String gender;
	
	private String pricingPlan;
	
	private Integer startingPrice;
	
	private Integer preBookingAmount;
	
	private String preBookingMode;
	
	private String googleMapLink;
	
	private String videoLink;
	
	private String virtualTourImage;
	
	@Builder.Default
	private Set<FacilityResponseDTO> facilites = new HashSet<>(0);
	
	@Builder.Default
	private Set<FeatureResponseDTO> features = new HashSet<>(0);
	
	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>(0);
}