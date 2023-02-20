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

    private boolean isFilteredUrl;
    private boolean isOsmUrl;

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

    //Actual Filter Data to be parsed and mapped to following variables, which will be passed to listing apis

    private String osmType;
    private Long osmId;

    private WebsiteAppliedFiltersDto controllerFilters;
    private WebsiteAppliedFiltersDto parsedFilters;

}
