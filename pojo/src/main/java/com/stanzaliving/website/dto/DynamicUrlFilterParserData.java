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
    private boolean isFilteredUrl = false;

    @Builder.Default
    private boolean isOsmLocationUrl = false;

    private String filteredParentSeoContents;
    private List<String> filteredChildSeoContents;

    private String unFilteredParentPageSeoContent;

    private String cityName;
    private String mmName;
    private String urlTargetPlaceName;

    //Actual Filter Data to be parsed and mapped to following variables, which will be passed to listing apis

    private Integer cityId;

    @Builder.Default
    private List<Integer> mmIds = new ArrayList<>();

    @Builder.Default
    private List<Gender> genderIn = new ArrayList<>();

    @Builder.Default
    private Set<Integer> occupancyIds = new HashSet<>();

    @Builder.Default
    private List<Integer> featureIdIn = new ArrayList<>();

    @Builder.Default
    private List<Integer> facilityIdIn = new ArrayList<>();

    @Builder.Default
    private Integer minPriceRange = null;

    @Builder.Default
    private Integer maxPriceRange = null;

    private String residenceType;

    @Builder.Default
    private List<Integer> roomCountIn = new ArrayList<>();

    @Builder.Default
    private boolean entireFlat = false;

    private Integer pageNo;
    private Integer pageSize;
}
