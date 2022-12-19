package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.*;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.dto.WebsiteImageLibraryDto;
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
public class ApartmentResponseDto implements Serializable, Comparable<ApartmentResponseDto> {

	private static final long serialVersionUID = 1L;
	
	private Integer residenceId;
	
	private String name;
	
	private String apartmentListingName;
	
	private String apartmentDetailsName;
	
	private String propertyCode;
	
	private Integer societyId;
	
	private Integer roomCount;
	
	private String slug;
	
	private String roomId;
	
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
	
	private boolean enabled;
	
	private String pricingPlan;
	
	private Integer startingPrice;
	
	private Integer sortOrder;
	
	private Integer secondSortOrder;
	
	private Integer preBookingAmount;

	private Integer unlockDiscountAmount;
	
	private String preBookingMode;
	
	private FomoTag fomoTag;
	
	private String fomoTagName;
	
	private String fomoTagcolour;
	
	private String googleMapLink;
	
	private double latitude;
	
	private double longitude;
	
	private String videoLink;
	
	private String virtualTourImage;
	
	private Double distanceFromPlace;
	
	private String floorNumber;
	
	private Double area;
	
	private Date created;
	
	private Integer discountPercentage;
	
	private Integer discountedPrice;
	
	private PropertyEntityType propertyEntityType;
	
	private List<ApartmentResponseDto> similarApartments;

	private AddressResponseDTO addressResponseDTO;

	@Builder.Default
	private Integer similarApartmentsCount = 0;
	
	private Boolean soldOut;
	
	private boolean isEntireFlatAvailable;

	private List<FacilityResponseDTO> facilities;
	
	private List<Integer> featureIds;

	private List<FeatureResponseDTO> features;
	
	@Builder.Default
	private List<ApartmentRoomTypeResponseDTO> apartmentRoomTypes = Collections.emptyList();

	private List<WebsiteImageLibraryDto> images;

	@Override
	public int compareTo(ApartmentResponseDto dto2) {
		
		if (Objects.isNull(getSortOrder()) || Objects.isNull(dto2.getSortOrder()))
			return getCreated().compareTo(dto2.getCreated());
		
		return getSortOrder().compareTo(dto2.getSortOrder());
	}
}