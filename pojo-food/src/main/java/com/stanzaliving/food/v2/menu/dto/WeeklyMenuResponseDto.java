package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.food.dto.FoodMenuBudgetDto;
import com.stanzaliving.food.v2.category.dto.CompositionRuleV2Dto;
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
	private boolean comboRulesSatisfied;
	private boolean budgetUtilizationInLimit;
	private boolean mealOfDayDefined;
	private Double newnessPercentage;
	private Double ratings;
	private boolean editingAllowed;
	private boolean comboAllowed;
	private List<DayWiseMenuDto> dayWiseMenu;
	private CompositionRuleV2Dto rules;
	private FoodMenuBudgetDto budgetRules;

}
