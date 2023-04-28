package com.stanzaliving.website.response.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.BannerPageType;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ListingPageBannerResponseDto extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private BannerPageType bannerPageType;

    private String bannerPageTypeName;

    private Integer cityId;

    private String cityName;

    private Integer micromarketId;

    private String micromarketName;

    private boolean displayToggle;

    private String configuration;
}
