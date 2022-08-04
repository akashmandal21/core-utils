package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class SpecialDayWiseBudgetDto {

	private LocalDate date ;

	private Double dayWiseBudget;

	private boolean isSpecialDay;

	private List<MealType> mealTypeList;

}
