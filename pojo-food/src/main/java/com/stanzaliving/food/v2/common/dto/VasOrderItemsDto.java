package com.stanzaliving.food.v2.common.dto;

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
public class VasOrderItemsDto extends AbstractDto {

	private static final long serialVersionUID = 2992336755869254321L;

	private String vasOrderId;

	private String itemId;

	private Integer quantity;

	private Integer orderedQuantity;

	private Double orderedWeight;

	private Double subTotal;

	private Double cgst;

	private Double sgst;

	private Double igst;

	private Double totalTax;

	private Double total;
}
