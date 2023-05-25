package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.website.enums.DynamicUrlsFilterCategory;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DynamicUrlsFilterDto extends AbstractDto {

    private static final long serialVersionUID = 1L;

    private DynamicUrlsFilterCategory filterCategory;

    private String filterCategoryName;

    private String filter;

    private String filterValue;

    private String defaultAlias;
    private List<String> aliases;
    private List<String> dynamicUrlSlugs;

    private String seoTitle;

    private String seoDescription;

    private String seoContent;

    private String seoFaq;
}
