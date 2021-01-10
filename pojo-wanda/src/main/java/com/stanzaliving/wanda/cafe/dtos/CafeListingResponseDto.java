package com.stanzaliving.wanda.cafe.dtos;

import java.util.List;

import com.stanzaliving.core.cafe.enums.SlotType;
import com.stanzaliving.core.cafe.order.constants.ServingMode;
import com.stanzaliving.core.cafe.order.dto.CafeRDto;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class CafeListingResponseDto {

	private List<CafeRDto> cafeRDtos;
	
	private List<EnumListing<ServingMode>> servingModes;
	
	private List<EnumListing<SlotType>> slotTypes;
	
}