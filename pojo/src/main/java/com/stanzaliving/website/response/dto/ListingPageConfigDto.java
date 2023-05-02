package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.WebsiteConfigType;
import com.stanzaliving.core.enums.WebsiteListingPageType;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListingPageConfigDto extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private WebsiteListingPageType websiteListingPageType;

    private String websiteListingPageTypeName;

    private WebsiteConfigType websiteConfigType;

    private String websiteConfigTypeName;

    private Integer cityId;

    private String cityName;

    private Integer micromarketId;

    private String micromarketName;

    private boolean configToggle;

    private String config;
}
