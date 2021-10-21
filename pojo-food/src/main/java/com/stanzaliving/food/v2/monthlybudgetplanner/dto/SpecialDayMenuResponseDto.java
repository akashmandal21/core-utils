package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import com.stanzaliving.food.v2.category.dto.DayWiseCogsDto;
import com.stanzaliving.food.v2.category.dto.MealWiseMenuDto;
import com.stanzaliving.food.v2.menu.dto.MenuWiseMenuSearchRDto;
import com.stanzaliving.wanda.BudgetDemographicsResponseDto;
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
public class SpecialDayMenuResponseDto extends MenuWiseMenuSearchRDto {


	private String dayWiseMonthlyBudgetId;
	private BudgetDemographicsResponseDto budgetDemographicsResponseDto;
	private List<BudgetDemographicsResponseDto> budgetDemographicsResponseDtoList;
	private List<MealWiseMenuDto> mealWiseMenus;
	private DayWiseCogsDto eventdayCogs;

	private boolean isSpecialMenuAvailable;

}
