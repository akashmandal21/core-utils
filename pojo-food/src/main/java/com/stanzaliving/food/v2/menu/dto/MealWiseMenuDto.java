package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.operations.enums.MealType;
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
public class MealWiseMenuDto implements Serializable {
	private MealType mealType;
	private Double cogs;
	private Double budgeted;
	private boolean subMealEnabled;
	private boolean regularMealEnabled;
	private List<MealOptionDto> mealOptions;

}
