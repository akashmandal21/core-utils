package com.stanzaliving.wanda.cafe.dtos;

import java.util.List;
import java.util.Map;

import com.stanzaliving.wanda.vas.response.ItemCostUIResponseDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CafeMenuResponseDto {

	private List<ItemCostUIResponseDto> recommendedItems;
	
	private Map<String, List<ItemCostUIResponseDto>> menuItems;
	
}
