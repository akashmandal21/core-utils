package com.stanzaliving.core.food.dto.response;

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

	private FoodBudgetPlanningSummaryDto residentsBudget;

	private FoodBudgetPlanningSummaryDto staffBudget;

	private FoodBudgetPlanningSummaryDto nonStaffBudget;

	private FoodBudgetPlanningSummaryDto overallBudget;

	private boolean approved;

}
