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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DynamicUrlRequiredParserDataReadOnly implements Serializable {

    private static final long serialVersionUID = 1L;

    @Builder.Default
    private List<DynamicUrlsFilterDto> pgPageIdentifierDynamicDtos = new ArrayList<>();
    @Builder.Default
    private List<DynamicUrlsFilterDto> colivingPageIdentifierDynamicDtos = new ArrayList<>();
    @Builder.Default
    private List<DynamicUrlsFilterDto> apartmentPageIdentifierDynamicDtos = new ArrayList<>();
    @Builder.Default

    private List<CityListingResponseDTO> cityListingDtos = new ArrayList<>();
    @Builder.Default
    private Map<Integer, List<MicromarketListingResponseDTO>> liveCityAndItsLiveMmListMap = new HashMap<>();
    @Builder.Default

    private List<DynamicUrlsFilterDto> genderFilterDynamicDtos = new ArrayList<>();
    @Builder.Default
    private List<DynamicUrlsFilterDto> occupancyFilterDynamicDtos = new ArrayList<>();
    @Builder.Default
    private List<DynamicUrlsFilterDto> budgetFilterDynamicDtos = new ArrayList<>();
    @Builder.Default
    private List<DynamicUrlsFilterDto> bhkFilterDynamicDtos = new ArrayList<>();
    @Builder.Default
    private List<DynamicUrlsFilterDto> entireFlatFilterDynamicDtos = new ArrayList<>();
    @Builder.Default
    private List<FeatureResponseDTO> featureResponseDtos = new ArrayList<>();
    @Builder.Default
    private List<FacilityResponseDTO> facilityResponseDtos = new ArrayList<>();

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
