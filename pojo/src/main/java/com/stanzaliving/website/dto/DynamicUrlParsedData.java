package com.stanzaliving.website.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DynamicUrlParsedData implements Serializable {

    private static final long serialVersionUID = 1L;

    private DynamicUrlRequiredParserDataReadOnly requiredParserDataReadOnly;

    private boolean isFilteredUrl;
    private boolean isFlatUrl;

    boolean isPgPage;
    boolean isColivingPage;
    boolean isApartmentPage;

    private String filteredSeoTitleCommon;
    private String filteredSeoDescriptionCommon;
    private String filteredSeoContentCommon;
    private String filteredSeoFaqCommon;

    @Builder.Default
    private String filteredSeoTitleChunks = "";

    @Builder.Default
    private String filteredSeoDescriptionChunks = "";

    @Builder.Default
    private String filteredSeoContentChunks = "";

    @Builder.Default
    private String filteredSeoFaqChunks = "";

    private WebsiteAppliedFiltersDto controllerFilters;
    private WebsiteAppliedFiltersDto parsedFilters;

    private SeoContentRequiredData seoContentRequiredData;
}
