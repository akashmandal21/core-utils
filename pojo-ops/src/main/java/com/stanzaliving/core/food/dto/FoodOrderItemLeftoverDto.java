package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class FoodOrderItemLeftoverDto {

	private String name;

	private String itemId;

	@Builder.Default
	private Integer leftoverQuantity = null;

	@Builder.Default
	private Double leftoverWeight = null;

	private FoodItemType foodItemType;

	private Boolean quantifiable;

}
