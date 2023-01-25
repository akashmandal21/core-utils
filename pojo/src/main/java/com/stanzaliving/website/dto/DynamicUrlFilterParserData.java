package com.stanzaliving.website.dto;

import com.stanzaliving.website.enums.Gender;
import com.stanzaliving.website.response.dto.CityListingResponseDTO;
import com.stanzaliving.website.response.dto.FacilityResponseDTO;
import com.stanzaliving.website.response.dto.FeatureResponseDTO;
import com.stanzaliving.website.response.dto.MicromarketListingResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DynamicUrlFilterParserData implements Serializable {

    private static final long serialVersionUID = 1L;

    List<DynamicUrlsFilterDto> pgPageIdentifierDynamicDtos;
    List<DynamicUrlsFilterDto> colivingPageIdentifierDynamicDtos;
    List<DynamicUrlsFilterDto> apartmentPageIdentifierDynamicDtos;

    List<CityListingResponseDTO> cityListingDtos;
    Map<Integer, List<MicromarketListingResponseDTO>> liveCityAndItsLiveMmListMap;

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

    @Builder.Default
    List<Gender> genderIn = new ArrayList<>();

    @Builder.Default
    Set<Integer> occupancyIds = new HashSet<>();

    @Builder.Default
    List<Integer> featureIdIn = new ArrayList<>();

    @Builder.Default
    List<Integer> facilityIdIn = new ArrayList<>();

    @Builder.Default
    Integer minPriceRange = null;

    @Builder.Default
    Integer maxPriceRange = null;

    String residenceType;

    @Builder.Default
    List<Integer> roomCountIn = new ArrayList<>();

    @Builder.Default
    boolean entireFlat = false;

    Integer pageNo;
    Integer pageSize;
}
