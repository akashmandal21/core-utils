package com.stanzaliving.community.brand.request;

import com.stanzaliving.community.brand.request.BrandRequestDto.BrandRequestDtoBuilder;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandPromotionsRequestDto extends AbstractDto{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long brandId;
	
	private String promotionsInfo;
	
	private String redirectionUrl;
	
	private String startDate;
	
	private String endDate;

}
