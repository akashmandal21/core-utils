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
    private SeoTemplateRequiredData seoTemplateRequiredData;
    private DynamicSeoTemplateVariablesDto dynamicSeoTemplateVariablesDto;

    private boolean isFilteredUrl;
    private boolean isFlatUrl;

    private boolean isSeoDataDbSaveRequired;
    private Long dynamicSeoUrlsEntityId;

    boolean isPgPage;
    boolean isColivingPage;
    boolean isApartmentPage;

    private WebsiteAppliedFiltersDto controllerFilters;
    private WebsiteAppliedFiltersDto parsedFilters;
}
