package com.stanzaliving.core.cafe.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author ashutosh.chandra "ashutoshchandra.retainer@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 29-Oct-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeItemPricingResponseDto {
	
	private String cafeId;
	
	private String cafeName;
	
	private List<BaseKitchenDto> kitchens = new ArrayList<>();
	
	private long enabledItemCount;
	
	private List<CafeItemPricingUpdateResponseDto> cafeItemsPricingList=  new ArrayList<>();;
}
