package com.stanzaliving.core.food.dto;

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
public class FoodOrderItemReceiveDto {

	private String name;

	private Double quantity;

	private Double weight;

	private boolean isLatelyAdded;

	private Integer orderedQuantity;

	private Double orderedWeight;

}
