package com.stanzaliving.food.v2.menu.dto;

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
public class WeeklyMenuResponseDto extends MenuWiseMenuSearchRDto {
	private boolean compositionRulesSatisfied;
	private boolean budgetUtilizationInLimit;
	private boolean mealOfDayDefined;
	private Double newnessPercentage;
	private Double ratings;
	private boolean editingAllowed;
	private boolean comboAllowed;
	private List<DayWiseMenuDto> dayWiseMenu;

}
