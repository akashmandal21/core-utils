package com.stanzaliving.banner.dto.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndUserEligblePromotions {
	
	private String userId;
	
	private String appPage;
	
	@Default
	private Map<String, List<PromotionResponseDto>> pageSectionMap = new HashMap<>();
}
