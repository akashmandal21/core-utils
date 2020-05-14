package com.stanzaliving.core.food.dto;

import java.util.List;

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
public class MealLevelItemDto {

	private String mealName;

	private Double averageMealCost;

	private List<FoodMenuItemWeightDto> foodMenuItemWeightDtos;
}
