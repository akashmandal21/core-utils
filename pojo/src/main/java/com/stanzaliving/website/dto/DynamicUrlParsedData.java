package com.stanzaliving.website.dto;

import com.stanzaliving.website.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DynamicUrlParsedData implements Serializable {

    private static final long serialVersionUID = 1L;

    private DynamicUrlRequiredParserDataReadOnly requiredParserDataReadOnly;

    @Builder.Default
    private boolean isFilteredUrl = false;

    @Builder.Default
    private boolean isOsmLocationUrl = false;

    boolean isPgPage;
    boolean isColivingPage;
    boolean isApartmentPage;

    private String seoTitle;
    private String seoDescription;
    private String seoContent;
    private String seoFaq;

    @Builder.Default
    private String filteredSeoTitleChunks = "";

    @Builder.Default
    private String filteredSeoDescriptionChunks = "";

    @Builder.Default
    private String filteredSeoContentChunks = "";

    @Builder.Default
    private String filteredSeoFaqChunks = "";

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
