package com.stanzaliving.core.cafe.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
public class PricingUpdateRequestDto extends AbstractDto{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cafeId;
			
	private List<CafeItemPricingUpdateRequestDto> cafeItemsPricingList;

}