package com.stanzaliving.website.dto;

import com.stanzaliving.website.response.dto.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeoContentRequiredData implements Serializable {

    private static final long serialVersionUID = 1L;

    private CityListingResponseDTO cityDto;

    private MicromarketListingResponseDTO micromarketDto;
    private List<MicromarketListingResponseDTO> nearByMicromarketDtos;

    private List<WebsiteNeighbourhoodDto> neighbourhoodDtos;

    private String slPlaceName;
    private String nameUrlSlug;











    private List<DynamicUrlsFilterDto> pgPageIdentifierDynamicDtos;
    private List<DynamicUrlsFilterDto> colivingPageIdentifierDynamicDtos;
    private List<DynamicUrlsFilterDto> apartmentPageIdentifierDynamicDtos;

    private List<CityListingResponseDTO> cityListingDtos;
    private Map<Integer, List<MicromarketListingResponseDTO>> liveCityAndItsLiveMmListMap;

    private List<DynamicUrlsFilterDto> genderFilterDynamicDtos;
    private List<DynamicUrlsFilterDto> occupancyFilterDynamicDtos;
    private List<DynamicUrlsFilterDto> budgetFilterDynamicDtos;
    private List<DynamicUrlsFilterDto> bhkFilterDynamicDtos;
    private List<DynamicUrlsFilterDto> entireFlatFilterDynamicDtos;
    private List<FeatureResponseDTO> featureResponseDtos;
    private List<FacilityResponseDTO> facilityResponseDtos;

    @Builder.Default
    private String osmPgPageSeoTitle = "";

    @Builder.Default
    private String osmPgPageSeoDescription = "";

    @Builder.Default
    private String osmPgPageSeoContent = "";

    @Builder.Default
    private String osmPgPageSeoFaq = "";

    @Builder.Default
    private String osmColivingPageSeoTitle = "";

    @Builder.Default
    private String osmColivingPageSeoDescription = "";

    @Builder.Default
    private String osmColivingPageSeoContent = "";

    @Builder.Default
    private String osmColivingPageSeoFaq = "";

    @Builder.Default
    private String osmApartmentPageSeoTitle = "";

    @Builder.Default
    private String osmApartmentPageSeoDescription = "";

    @Builder.Default
    private String osmApartmentPageSeoContent = "";

    @Builder.Default
    private String osmApartmentPageSeoFaq = "";
}
