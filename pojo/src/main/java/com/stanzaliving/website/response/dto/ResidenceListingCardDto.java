package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

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
public class ResidenceListingCardDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private int residenceId;

	private String name;

	private String slug;

	private Gender gender;
	
	private String genderName;

	private int micromarketId;

	private String micromarketName;

	private String micromarketSlug;

	private int cityId;

	private String cityName;

	private String citySlug;

	private int startingPrice;

	private String pricingPlan;

	private Integer preBookingAmount;

	private Integer unlockDiscountAmount;

	private double discountPercentage;

	private Integer discountedPrice;

	private String preBookingMode;

	private String googleMapLink;

	private double latitude;

	private double longitude;

	private String virtualTourImage;

	private String videoLink;

	private Integer sortOrder;

	private Integer secondSortOrder;

	private FomoTag fomoTag;

	private String fomoTagName;

	private String fomoTagcolour;

	private Double distanceFromPlace;

	private String transformationUuid;

	private String transformationId;

	private Integer residenceAddressId;

	private String seoTitle;

	private String seoDescription;

	private AddressResponseDTO addressResponseDTO;
	
	private Integer residenceTypeId;
	
	private PropertyEntityType propertyEntityType;

	private List<FacilityResponseDTO> facilities;
	
	private List<FeatureResponseDTO> features;

	private List<ResidenceOccupancyResponseDTO> residenceOccupancies;

	private List<WebsiteImageLibraryDto> images;
}
