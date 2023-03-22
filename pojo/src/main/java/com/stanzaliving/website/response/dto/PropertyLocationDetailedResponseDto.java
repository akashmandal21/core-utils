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

    // room level
    private String propertyLocationDetailsName;

    // room level
    private String propertyLocationListingName;

    private String residenceName;

    // left
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

    // left
    private boolean isEntireFlatAvailable;

    // left
    // room level
    private boolean soldOut;

    private PropertyEntityType propertyEntityType;

    private List<FacilityResponseDTO> facilities;

    private List<FeatureResponseDTO> features;

    // left
    private List<WebsiteImageLibraryDto> images;

    // left
    private WebsitePlaceIndexDto placeIndexDto;
}
