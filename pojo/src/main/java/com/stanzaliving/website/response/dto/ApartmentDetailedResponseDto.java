package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.*;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.dto.WebsiteImageLibraryDto;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;
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
	
	private String roomId;

	private String roomNumber;
	
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
	
	private Integer preBookingAmount;

	private Integer unlockDiscountAmount;
	
	private String preBookingMode;
	
    private Integer leadFormModeId;
	
	private String leadFormModeName;
	
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

	private String seoTitle;
	
	private String seoDescription;

	private String description;

	private String seoFaq;

	private String transformationUuid;
	
	private String transformationId;
	
	private AddressResponseDTO address;
	
	private double discountPercentage;
	
	private Integer discountedPrice;
	
	private Boolean soldOut;
	
	private boolean isEntireFlatAvailable;
	
	private PropertyEntityType propertyEntityType;
	
	@Builder.Default
	private List<FacilityResponseDTO> facilities = Collections.emptyList();
	
	@Builder.Default
	private List<FeatureResponseDTO> features = Collections.emptyList();
	
	@Builder.Default
	private List<ApartmentRoomTypeResponseDTO> apartmentRoomTypes = Collections.emptyList();

	private List<String> ventaRoomNumbers;
	
	private List<WebsiteImageLibraryDto> images;
	
	@Builder.Default
	private Set<ResidenceNearbyLocationResponseDTO> residenceNearbyLocations = new HashSet<>(0);
	
	private ApartmentShortListingDto moreApartmentsInSociety;
	
	private ApartmentShortListingDto similarApartmentsNearBy;
	
	private List<ReviewWebsiteResponseDto> reviews;
	
	private List<WebsiteMapCardDto> cityAllProperties;
	
	private List<ApartmentResponseDto> otherRooms;
	
	private WebsitePlaceIndexDto placeIndexDto;

	private boolean showDiscount;

	private Integer inventoryPrice;
}