package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.enums.PropertyEntityType;
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
public class ApartmentListingCardDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private int residenceId;

	private String name;

	private String apartmentListingName;
	
	private String apartmentDetailsName;
	
	private String propertyCode;
	
	private Integer societyId;
	
	private Integer roomCount;
	
	private String roomId;
	
	private String slug;

	private Gender gender;
	
	private String genderName;

	private int micromarketId;

	private String micromarketName;

	private String micromarketSlug;
	
	private String apartmentMMSlug;
	
	private int cityId;
	
	private String cityName;
	
	private String citySlug;
	
	private String apartmentCitySlug;
	
	private int startingPrice;
	
	private Integer discountPercentage;
	
	private Integer discountedPrice;

	private String pricingPlan;

	private Integer preBookingAmount;

	private Integer unlockDiscountAmount;

	private String preBookingMode;

	private String googleMapLink;

	private double latitude;

	private double longitude;

	private String virtualTourImage;

	private String videoLink;

	private Integer sortOrder;

	private Integer secondSortOrder;

	private Double distanceFromPlace;

	private String transformationUuid;

	private String transformationId;

	private Integer residenceAddressId;

	private AddressResponseDTO addressResponseDTO;
	
	private Integer residenceTypeId;
	
	private PropertyEntityType propertyEntityType;

	private List<Integer> featureIds;
	
	private List<FacilityResponseDTO> facilities;
	
	private List<FeatureResponseDTO> features;

	private List<ImageResponseDTO> images;
	
	private int similarApartmentsCount;
	
	private boolean soldOut;
	
	private boolean isEntireFlatAvailable;
	
	private List<ApartmentRoomTypeResponseDTO> apartmentRoomTypes;
}
