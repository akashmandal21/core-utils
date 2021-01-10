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
public class FoodOrderItemReceiveDto {

	private String name;

	private String itemId;

	@Builder.Default
	private Integer quantity = null;

	@Builder.Default
	private Double weight = null;

	@Builder.Default
	private Boolean isLatelyAdded = false;

	@Builder.Default
	private Boolean isLatelyRemoved = false;

	@Builder.Default
	private Boolean received = false;

	private FoodItemType foodItemType;

	private Boolean quantifiable;

}