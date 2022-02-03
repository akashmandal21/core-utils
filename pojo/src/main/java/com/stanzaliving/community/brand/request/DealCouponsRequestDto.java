package com.stanzaliving.community.brand.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DealCouponsRequestDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

	private long coupon_Id;
	
	private long dealId;
	
	private String couponCode;
}
