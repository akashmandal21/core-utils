package com.stanzaliving.food.v2.menu.dto;


import java.time.LocalDate;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.operations.enums.MealType;

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
public class FoodMenuEntityDto extends AbstractDto {

	private static final long serialVersionUID = 4993973400094678924L;

	private String menuGroupId;

	private LocalDate menuDate;

	private MealType mealType;

	private FoodRegion foodRegion;

	private FoodItemBasePreference preference;

	private Double menuCost;

	public Double budgetedCost;

	private Float menuRating;

}
