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

    private String name;

    private String propertyLocationListingName;

    private String propertyLocationDetailsName;

    private String slug;

    private int micromarketId;

    private String micromarketName;

    private String micromarketSlug;

    private String apartmentMMSlug;

    private int cityId;

    private String cityName;

    private String citySlug;

    private String apartmentCitySlug;

    @Builder.Default
    private ListingPriceDto listingPriceDto = ListingPriceDto.builder().build();

    private String pricingPlan;

    private Integer preBookingAmount;

    private Integer unlockDiscountAmount;

    private String googleMapLink;

    private double latitude;

    private double longitude;

    private Double distanceFromPlace;

    private String seoTitle;

    private String seoDescription;

    private AddressResponseDTO addressResponseDTO;

    private PropertyEntityType propertyEntityType;

    private List<Integer> featureIds;

    private List<FacilityResponseDTO> facilities;

    private List<FeatureResponseDTO> features;

    private List<WebsiteImageLibraryDto> images;

    private boolean isPropertyLocationSoldOut;

    private Date singleRoomNextAvailableFrom;

    private Date entireFlatNextAvailableFrom;

    private boolean isEntireFlatAvailable;
    
    private boolean isPropertyLocationListingCardEligible;
}
