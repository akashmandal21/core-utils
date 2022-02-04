package com.stanzaliving.community.brand.response;

import com.stanzaliving.community.enums.EventStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDealsResponseDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private String brandName;

	@Default
	private EventStatus dealStatus = EventStatus.IN_DRAFT;

	private String brandLogo;

	private String backgroundImage;

	private String dealDescription;

	private String dealInfo;

	private String primaryCtaText;

	private String secondaryCtaText;

	private String redirectionUrl;

	private String startDate;

	private String endDate;

	private String userCouponCode;

}
