package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealWisePriceDto implements Serializable {
	private MealType mealType;
	private String mealName;
	private Map<DayOfWeek, Double> dayWiseCost;
	private Double trueCost;
	private Double pricePerDay;
}
