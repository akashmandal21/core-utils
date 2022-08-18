package com.stanzaliving.community.brand.response;

import java.util.List;

import com.stanzaliving.banner.enumeration.AppPage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EndUserBrandDealsResponseDto {
	
	private String userId;
	
	private String userCode;
	
	private AppPage appPage;
	
	private List<BrandDealsResponseDto> brandDealResponseDtos;
}
