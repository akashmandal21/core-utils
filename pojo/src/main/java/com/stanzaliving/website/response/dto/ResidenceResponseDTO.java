package com.stanzaliving.website.response.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.stanzaliving.website.enums.FomoTag;
import com.stanzaliving.website.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResidenceResponseDTO {

	private int residenceId;
	private String name;
	private Gender gender;
	private int micromarketId;
	private String micromarketName;
	private String micromarketSlug;
	private int cityId;
	private String cityName;
	private String citySlug;
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
	private Integer preBookingAmount;
	private String preBookingMode;
	private FomoTag fomoTag;
	private String residenceType;
	private String googleMapLink;
	private String virtualTourImage;
	private Double distanceFromPlace;

	@Builder.Default
	private Set<FeatureResponseDTO> features = new HashSet<>(0);

	@Builder.Default
	private Set<FacilityResponseDTO> facilities = new HashSet<>(0);

	@Builder.Default
	private Set<ResidenceOccupancyResponseDTO> residenceOccupancies = new HashSet<>(0);

	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>(0);

	@Builder.Default
	private Set<ResidenceNearbyLocationResponseDTO> residenceNearbyLocations = new HashSet<>(0);

	private AddressResponseDTO address;
	
	private List<ReviewWebsiteResponseDto> reviews;
}
