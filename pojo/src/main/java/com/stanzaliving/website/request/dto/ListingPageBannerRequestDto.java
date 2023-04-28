package com.stanzaliving.website.request.dto;

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
public class ListingPageBannerRequestDto extends AbstractDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private BannerPageType bannerPageType;

    private Integer cityId;

    private Integer micromarketId;

    private boolean displayToggle;

    private boolean overrideHierarchy;

    private String configuration;
}
