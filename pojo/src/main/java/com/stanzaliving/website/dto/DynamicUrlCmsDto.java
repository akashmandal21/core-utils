package com.stanzaliving.website.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.website.enums.DynamicUrlType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DynamicUrlCmsDto extends AbstractDto {

    private static final long serialVersionUID = 1L;

    private DynamicUrlType dynamicUrlType;

    private String dynamicUrlTypeName;

    private PropertyEntityType propertyEntityType;

    private String url;

    private Long osmId;

    private String osmType;

    private String classification;

    private String type;

    private String name;

    private String displayName;

    private Integer adminLevel;

    private double latitude;

    private double longitude;

    private Integer websiteCityId;

    private Integer websiteMmId;

    private String transformationCityUuid;

    private String transformationMmUuid;

    private String seoTitle;

    private String seoDescription;

    private String seoContent;

    private String seoFaq;
}
