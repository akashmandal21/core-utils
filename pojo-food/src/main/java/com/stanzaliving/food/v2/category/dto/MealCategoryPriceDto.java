package com.stanzaliving.food.v2.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealCategoryPriceDto implements Serializable {
	private Double mealPrice;
	private Double vegMealPrice;
	private List<MealWisePriceDto> mealWisePrice;
}
