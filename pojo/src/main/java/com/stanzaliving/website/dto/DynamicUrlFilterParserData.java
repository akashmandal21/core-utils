package com.stanzaliving.website.dto;

import com.stanzaliving.website.enums.DynamicUrlsFilterCategory;
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
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DynamicUrlFilterParserData implements Serializable {

    List<DynamicUrlsFilterDto> pgPageIdentifierDynamicDtos;
    List<DynamicUrlsFilterDto> colivingPageIdentifierDynamicDtos;
    List<DynamicUrlsFilterDto> apartmentPageIdentifierDynamicDtos;

    List<CityListingResponseDTO> cityListingDtos;
    Map<Integer, List<MicromarketListingResponseDTO>> micromarketListingDtos;

    List<DynamicUrlsFilterDto> genderFilterDynamicDtos;
    List<DynamicUrlsFilterDto> occupancyFilterDynamicDtos;
    List<DynamicUrlsFilterDto> budgetFilterDynamicDtos;
    List<DynamicUrlsFilterDto> bhkFilterDynamicDtos;
    List<DynamicUrlsFilterDto> entireFlatFilterDynamicDtos;
    List<FeatureResponseDTO> featureResponseDtos;
    List<FacilityResponseDTO> facilityResponseDtos;

    //Actual Filter Data to be parsed and mapped to following variables, which will be passed to listing apis

    Integer cityId;

    @Builder.Default
    List<Integer> mmIds = new ArrayList<>();
}
