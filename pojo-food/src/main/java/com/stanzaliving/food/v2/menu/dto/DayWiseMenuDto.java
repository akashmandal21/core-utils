package com.stanzaliving.food.v2.menu.dto;

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
	private List<MealWiseMenuDto> mealWiseMenus;
	private Double estimatedCost;
	private Double budgetedCost;
}
