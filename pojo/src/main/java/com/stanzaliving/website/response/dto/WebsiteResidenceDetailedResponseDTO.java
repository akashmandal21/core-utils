package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.*;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.dto.WebsiteImageLibraryDto;
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
public class WebsiteResidenceDetailedResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int residenceId;
	
	private String name;
	
	private Gender gender;
	
	private String genderName;
	
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

	private Integer unlockDiscountAmount;

	private double discountPercentage;

	private Integer discountedPrice;
	
	private String preBookingMode;
	
	private String leadFormModeName;
	
	private Integer leadFormModeId;
	
	private FomoTag fomoTag;
	
	private String fomoTagName;
	
	private String fomoTagcolour;
	
	private String residenceType;
	
	private String googleMapLink;
	
	private String videoLink;
	
	private String virtualTourImage;
	
	private Double distanceFromPlace;
	
	private String transformationUuid;
	
	private String transformationId;
	
	private PropertyEntityType propertyEntityType; 

	@Builder.Default
	private List<FeatureResponseDTO> features = Collections.emptyList();

	@Builder.Default
	private List<FacilityResponseDTO> facilities = Collections.emptyList();

	@Builder.Default
	private List<ResidenceOccupancyResponseDTO> residenceOccupancies = Collections.emptyList();

	private List<WebsiteImageLibraryDto> images;

	@Builder.Default
	private Set<ResidenceNearbyLocationResponseDTO> residenceNearbyLocations = new HashSet<>();

	private AddressResponseDTO address;
	
	private List<ReviewWebsiteResponseDto> reviews;
	
	private ResidenceFilteredResponseDTO similarResidencesNearBy;
	
	private List<WebsiteMapCardDto> cityAllProperties;

}
