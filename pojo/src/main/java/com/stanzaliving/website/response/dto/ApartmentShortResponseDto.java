package com.stanzaliving.website.response.dto;

import com.stanzaliving.website.dto.WebsiteImageLibraryDto;
import com.stanzaliving.website.enums.FomoTag;
import com.stanzaliving.website.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentShortResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer residenceId;
	
	private String name;
	
	private String apartmentDetailsName;
	
	private String apartmentListingName;
	
	private Gender gender;

	private Integer micromarketId;
	
	private String micromarketName;
	
	private String micromarketSlug;
	
	private String apartmentMMSlug;
	
	private int cityId;
	
	private String cityName;
	
	private String citySlug;
	
	private String apartmentCitySlug;
	
	private String propertyCode;
	
	private Integer societyId;
	
	private Integer roomCount;
	
	private String slug;
	
	private FomoTag fomoTag;
	
	private String fomoTagName;
	
	private String fomoTagcolour;
	
	private String pricingPlan;
	
	private Integer startingPrice;

	private double discountPercentage;

	private Integer discountedPrice;
	
	private String transformationUuid;
	
	private String transformationId;
	
	private Double latitude;
	
	private Double longitude;
	
	private Double distanceFromPlace;
	
	private List<FeatureResponseDTO> features;

	private AddressResponseDTO addressResponseDTO;

	private List<WebsiteImageLibraryDto> images;
}