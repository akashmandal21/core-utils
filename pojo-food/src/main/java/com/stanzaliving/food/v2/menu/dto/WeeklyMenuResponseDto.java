package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.food.dto.FoodMenuBudgetDto;
import com.stanzaliving.food.v2.category.dto.CompositionRuleV2Dto;
import com.stanzaliving.food.v2.category.dto.DayWiseCogsDto;
import com.stanzaliving.food.v2.category.dto.MealWiseMenuDto;
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

	private static final long serialVersionUID = 6651823692057928684L;
	private boolean compositionRulesSatisfied;
	private boolean comboRulesSatisfied;
	private boolean budgetUtilizationInLimit;
	private boolean hybridMealRuleSatisfied;
	private boolean mealOfDayDefined;
	private boolean menuDefined;
	private Double newnessPercentage;
	private Double ratings;
	private boolean editingAllowed;
	private boolean comboAllowed;
	private List<MealWiseMenuDto> mealWiseMenus;
	private List<DayWiseCogsDto> dayWiseCogs;
	private CompositionRuleV2Dto rules;
	private FoodMenuBudgetDto budgetRules;
	private boolean copyAction;

}