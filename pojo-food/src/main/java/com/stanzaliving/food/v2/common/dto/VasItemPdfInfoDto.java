package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VasItemPdfInfoDto {

	private String itemName;
	private String itemId;
	private FoodItemType foodItemType;
	private String baseUnit;
	private Integer quantity;
	private Integer kitchenQuantity;
	private Double kitchenWeight;
}