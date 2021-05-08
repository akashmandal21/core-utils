package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.stanzaliving.website.enums.FomoTag;
import com.stanzaliving.website.enums.Gender;

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
	
	private Integer residenceId;
	
	private String propertyCode;
	
	private Long societyId;
	
	private Integer roomCount;
	
	private String apartmentName;
	
	private String slug;
	
	private Gender gender;

	private int micromarketId;
	
	private String micromarketName;
	
	private String micromarketSlug;
	
	private int cityId;
	
	private String cityName;
	
	private String citySlug;
	
	private String pricingPlan;
	
	private Integer startingPrice;
	
	private Integer preBookingAmount;
	
	private String preBookingMode;
	
	private String googleMapLink;
	
	private double latitude;
	
	private double longitude;
	
	private String videoLink;
	
	private String virtualTourImage;
	
	private String area;
	
	private String floorNumber;
	
	private FomoTag fomoTag;
	
	private String description;
	
	private AddressResponseDTO address;
	
	@Builder.Default
	private Set<FacilityResponseDTO> facilites = new HashSet<>();
	
	@Builder.Default
	private Set<FeatureResponseDTO> features = new HashSet<>();
	
	@Builder.Default
	private Set<ApartmentRoomTypeResponseDTO> apartmentRoomTypes = new HashSet<>();
	
	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>();
	
	@Builder.Default
	private Set<ResidenceNearbyLocationResponseDTO> residenceNearbyLocations = new HashSet<>(0);
	
	private ApartmentShortListingDto moreApartmentsInSociety;
	
	private ApartmentShortListingDto similarApartmentsNearBy;
}