package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.food.enums.FoodBudgetPlannerStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CombinedFoodBudgetPlanningSummaryDto {
	
	private AccessLevel accessLevel;

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private String residenceId;

	private String residenceName;

	private FoodBudgetPlanningSummaryDto residentsBudget;

	private FoodBudgetPlanningSummaryDto staffBudget;

	private FoodBudgetPlanningSummaryDto nonStaffBudget;

	private FoodBudgetPlanningSummaryDto overallBudget;

	private boolean approved;

	private FoodBudgetPlannerStatus budgetStatus;
}