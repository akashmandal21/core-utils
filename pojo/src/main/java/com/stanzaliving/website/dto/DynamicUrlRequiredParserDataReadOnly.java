package com.stanzaliving.website.dto;

import com.stanzaliving.website.response.dto.CityListingResponseDTO;
import com.stanzaliving.website.response.dto.FacilityResponseDTO;
import com.stanzaliving.website.response.dto.FeatureResponseDTO;
import com.stanzaliving.website.response.dto.MicromarketListingResponseDTO;
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
public class DynamicUrlRequiredParserDataReadOnly implements Serializable {

    private static final long serialVersionUID = 1L;

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

    private String osmPgPageSeoTitle;
    private String osmPgPageSeoDescription;
    private String osmPgPageSeoContent;
    private String osmPgPageSeoFaq;

    private String osmColivingPageSeoTitle;
    private String osmColivingPageSeoDescription;
    private String osmColivingPageSeoContent;
    private String osmColivingPageSeoFaq;

    private String osmApartmentPageSeoTitle;
    private String osmApartmentPageSeoDescription;
    private String osmApartmentPageSeoContent;
    private String osmApartmentPageSeoFaq;
}
