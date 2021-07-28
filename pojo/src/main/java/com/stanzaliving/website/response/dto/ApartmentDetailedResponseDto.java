package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
	
	private String name;
	
	private String apartmentDetailsName;
	
	private String apartmentListingName;
	
	private String propertyCode;
	
	private Integer societyId;
	
	private String societyName;
	
	private Integer roomCount;
	
	private String slug;
	
	private Gender gender;

	private int micromarketId;
	
	private String micromarketName;
	
	private String micromarketSlug;
	
	private String apartmentMMSlug;
	
	private int cityId;
	
	private String cityName;
	
	private String citySlug;
	
	private String apartmentCitySlug;
	
	private boolean enabled;
	
	private String pricingPlan;
	
	private Integer startingPrice;
	
	private Integer preBookingAmount;
	
	private String preBookingMode;
	
	private String googleMapLink;
	
	private double latitude;
	
	private double longitude;
	
	private String videoLink;
	
	private String virtualTourImage;
	
	private String floorNumber;
	
	private Double area;
	
	private FomoTag fomoTag;
	
	private String fomoTagName;
	
	private String fomoTagcolour;
	
	private String description;
	
	private String seoTitle;
	
	private String seoDescription;
	
	private String transformationUuid;
	
	private String transformationId;
	
	private AddressResponseDTO address;
	
	@Builder.Default
	private List<FacilityResponseDTO> facilities = Collections.emptyList();
	
	@Builder.Default
	private List<FeatureResponseDTO> features = Collections.emptyList();
	
	@Builder.Default
	private List<ApartmentRoomTypeResponseDTO> apartmentRoomTypes = Collections.emptyList();
	
	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>();
	
	@Builder.Default
	private Set<ResidenceNearbyLocationResponseDTO> residenceNearbyLocations = new HashSet<>(0);
	
	private ApartmentShortListingDto moreApartmentsInSociety;
	
	private ApartmentShortListingDto similarApartmentsNearBy;
	
	private List<ReviewWebsiteResponseDto> reviews;
}