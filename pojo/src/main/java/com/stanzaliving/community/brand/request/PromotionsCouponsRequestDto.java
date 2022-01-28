package com.stanzaliving.community.brand.request;

import com.stanzaliving.community.brand.request.BrandPromotionsRequestDto.BrandPromotionsRequestDtoBuilder;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromotionsCouponsRequestDto extends AbstractDto {
	
	private long brandId;
	
	private long promotionId;
	
	private boolean isUserSpecific;

	private boolean isRedeemed;
	
	private boolean userId;
}
