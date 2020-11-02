package com.stanzaliving.core.cafe.dto;

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
public class CafeItemPricingUpdateRequestDto {
	
	private String itemId;

	private Double masterPriceInclGst;

	private List<CogsPriceDto> cogs;
	
	private boolean itemEnableStatus;
	
	private List<ResidenceItemPricingUpdateRequestDto> residenceItemPricingList;

}	