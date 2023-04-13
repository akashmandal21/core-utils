package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.LocationType;
import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.dto.WebsiteImageLibraryDto;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationListingCardDto extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long propertyLocationId;

    private String locationServiceUuid;

    private String name;

    private LocationType locationType;

    private String locationTypeName;

    private String nearbyArea;

    private Integer roomCount;

    private Integer sortOrder;

    private String propertyLocationListingName;

    private String propertyLocationDetailsName;

    private String slug;

    private String residenceName;

    private String propertyCode;

    private int micromarketId;

    private String micromarketName;

    private String micromarketSlug;

    private String apartmentMMSlug;

    private int cityId;

    private String cityName;

    private String citySlug;

    private String apartmentCitySlug;

    private Integer singleRoomStartingPrice;

    private Integer singleRoomDiscountedPrice;

    private Integer entireFlatStartingPrice;

    private Integer entireFlatDiscountedPrice;

    private boolean entireFlatSoldOutTag;

    private String pricingPlan;

    private Integer preBookingAmount;

    private Integer unlockDiscountAmount;

    private String googleMapLink;

    private double latitude;

    private double longitude;

    private Double distanceFromPlace;

    private String seoTitle;

    private String seoDescription;

    private String seoContent;

    private String seoFaq;

    private AddressResponseDTO addressResponseDTO;

    private PropertyEntityType propertyEntityType;

    private List<FacilityResponseDTO> facilities;

    private List<FeatureResponseDTO> features;

    private List<WebsiteImageLibraryDto> images;

    private boolean isPropertyLocationSoldOut;

    private Date singleRoomNextAvailableFrom;

    private Date entireFlatNextAvailableFrom;

    private boolean isEntireFlatAvailable;

    private boolean isPropertyLocationListingCardEligible;

    private boolean isEntireFlatFilterApplied;

    private List<LeadFormAndPricingDTO> leadFormAndPricingDTOs;

    List<ApartmentListingCardDto> apartmentListingCardDTOs;
}
