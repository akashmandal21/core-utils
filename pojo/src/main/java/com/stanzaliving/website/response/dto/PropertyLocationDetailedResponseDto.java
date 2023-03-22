package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.dto.WebsiteImageLibraryDto;
import com.stanzaliving.website.elasticsearch.index.dto.WebsitePlaceIndexDto;
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
public class PropertyLocationDetailedResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long propertyLocationId;

    private String name;

    private String propertyLocationDetailsName;

    private String propertyLocationListingName;

    // for lambda
    private String residenceName;

    //
    private List<PriceDTO> pricing;

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

    private String preBookingMode;

    private Integer leadFormModeId;

    private String leadFormModeName;

    private String googleMapLink;

    private double latitude;

    private double longitude;

    private String seoTitle;

    private String seoDescription;

    private String description;

    private String seoFaq;

    private String locationServiceUuid;

    private AddressResponseDTO address;

    //
    private boolean isEntireFlatAvailable;

    private PropertyEntityType propertyEntityType;

    private List<FacilityResponseDTO> facilities;

    private List<FeatureResponseDTO> features;

    //
    private List<WebsiteImageLibraryDto> images;

    // map cards in details page. Can use this from listing page map api
    private List<WebsiteMapCardDto> cityAllProperties;

    // if user lands up searching a place
    private WebsitePlaceIndexDto placeIndexDto;
}
