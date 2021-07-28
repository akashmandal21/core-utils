package com.stanzaliving.food.v2.category.dto;

import java.io.Serializable;
import java.util.List;

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
public class MealWisePricePdto implements Serializable {
	private Double marginPercentage;
	private Double utilityCost;
	private Double packagingCost;
	private Double transportCost;
	private Double incentiveCost;
	private Double serviceStaffCost;
	private List<MenuCategoryMealDto> meals;
}
