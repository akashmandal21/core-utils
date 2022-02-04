package com.stanzaliving.community.brand.response;

import java.util.List;

import com.stanzaliving.banner.enumeration.AppPage;
import com.stanzaliving.community.brand.request.BrandDealsRequestDto;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EndUserBrandDealsResponseDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

	private String userId;
	
	private String userCode;
	
	private AppPage appPage;
	
	private List<BrandDealsRequestDto> brandDealResponseDtos;
}
