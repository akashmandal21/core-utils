package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.CouponCardDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CouponListingResponseDto {

	private List<CouponCardDto> availableCoupons;
	
	private List<CouponCardDto> otherCoupons;
}
