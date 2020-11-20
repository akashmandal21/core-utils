package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeItemPriceDto extends AbstractDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cafeId;

	private String cafeName;

	private String itemId;

	private String itemName;

	private double itemPrice;

	private int availableInventoryCount;

	private boolean enabled;
}