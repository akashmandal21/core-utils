package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.dto.WebsiteImageLibraryDto;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyLocationDetailedResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long propertyLocationId;

    private String name;

    private String propertyLocationDetailsName;

    private String propertyLocationListingName;

    private String residenceName;
    
    private List<LeadFormAndPricingDTO> leadFormAndPricingDTOS;

    private String slug;

    private int micromarketId;

    private String micromarketName;

    private String micromarketSlug;

    private String apartmentMMSlug;

    private int cityId;

    private String cityName;

    private String citySlug;

    private String apartmentCitySlug;

    private String pricingPlan;

    private Integer preBookingAmount;

    private Integer unlockDiscountAmount;

    private String googleMapLink;

    private double latitude;

    private double longitude;

    private String seoTitle;

    private String seoDescription;

    private String description;

    private String seoFaq;

    private String locationServiceUuid;

    private AddressResponseDTO address;

    private boolean isEntireFlatAvailable;

    private boolean isEntireFlatFilterApplied;

    private boolean soldOut;

    private Date singleRoomNextAvailableFrom;

    private Date entireFlatNextAvailableFrom;

    private PropertyEntityType propertyEntityType;

    private List<FacilityResponseDTO> facilities;

    private List<FeatureResponseDTO> features;

    private List<WebsiteImageLibraryDto> images;

    private WebsitePlaceIndexDto placeIndexDto;
}
