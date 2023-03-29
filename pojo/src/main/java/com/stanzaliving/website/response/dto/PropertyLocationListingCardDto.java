package com.stanzaliving.website.response.dto;

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
public class PropertyLocationListingCardDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long propertyLocationId;

    private String locationServiceUuid;

    private String name;

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

    // for wishlist
    private Integer singleRoomStartingPrice;

    private Integer singleRoomDiscountedPrice;

    // for wishlist
    private Integer entireFlatStartingPrice;

    private Integer entireFlatDiscountedPrice;

    private String pricingPlan;

    private Integer preBookingAmount;

    private Integer unlockDiscountAmount;

    private String googleMapLink;

    private double latitude;

    private double longitude;

    private Double distanceFromPlace;

    private String seoTitle;

    private String seoDescription;

    private String description;

    private String seoFaq;

    private AddressResponseDTO addressResponseDTO;

    private PropertyEntityType propertyEntityType;

    private List<FacilityResponseDTO> facilities;

    private List<FeatureResponseDTO> features;

    // for wishlist
    private List<WebsiteImageLibraryDto> images;

    // for wishlist
    private boolean isPropertyLocationSoldOut;

    // for wishlist
    private Date singleRoomNextAvailableFrom;

    // for wishlist
    private Date entireFlatNextAvailableFrom;

    // for wishlist
    private boolean isEntireFlatAvailable;

    private boolean isPropertyLocationListingCardEligible;

    private boolean isEntireFlatFilterApplied;

    private List<LeadFromDropDownDTO> leadFromDropDownDTOs;

    List<ApartmentListingCardDto> apartmentListingCardDTOs;
}
