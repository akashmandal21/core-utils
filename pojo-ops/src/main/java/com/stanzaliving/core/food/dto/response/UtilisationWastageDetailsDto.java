package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UtilisationWastageDetailsDto {

	private MealType mealType;
	private String mealName;
	private double expectedUtilisationPercentage;
	private double consumptionPercentage;
	private double wastagePercentage;
	private double expectedUtilizationPercentage;
	private boolean isShortage;
	private List<FoodShortageDetailsDto> foodShortageDetailsDtoList;

}
