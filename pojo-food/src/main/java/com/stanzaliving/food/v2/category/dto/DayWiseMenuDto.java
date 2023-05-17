package com.stanzaliving.food.v2.category.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class DayWiseMenuDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private LocalDate menuDate;
	private DayOfWeek dayOfWeek;
	private boolean disabled;
	private boolean enabled;

	private List<MealOptionDto> mealOptions;
	private Boolean mealOfDayChanged;
	
	private boolean subMealEnabled;
	private boolean subMealMenuDefined;
	private boolean regularMealEnabled;
	private boolean regularMealMenuDefined;
	private Double cogs;
	private Double budgeted;
	@Builder.Default
	private boolean beverageRuleSatisfied = true;
	@Builder.Default
	private boolean defaultBeverageRuleSatisfied = true;
}
