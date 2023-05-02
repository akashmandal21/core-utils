package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.WebsiteConfigType;
import com.stanzaliving.core.enums.WebsiteListingPageType;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListingPageConfigDto extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private WebsiteListingPageType websiteListingPageType;

    private String websiteListingPageTypeName;

    @NotNull
    private WebsiteConfigType websiteConfigType;

    private String websiteConfigTypeName;

    private Integer cityId;

    private String cityName;

    private Integer mmId;

    private String micromarketName;

    private boolean configToggle;

    private String config;
}
