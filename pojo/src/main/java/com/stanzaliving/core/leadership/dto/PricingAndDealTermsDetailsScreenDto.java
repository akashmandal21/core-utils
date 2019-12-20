package com.stanzaliving.core.leadership.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
public class PricingAndDealTermsDetailsScreenDto {

	private TopViewDto topViewDto;
	
	private PricingViewEstateData pricingViewEstateData;
	
	private PricingApprovalScreenDto pricingApprovalScreenDto;
	
	private List<DealTermsDto> dealTermsDtos;
	
}
