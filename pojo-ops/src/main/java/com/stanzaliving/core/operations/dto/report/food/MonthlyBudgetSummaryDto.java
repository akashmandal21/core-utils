/**
 * 
 */
package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.MonthlyBudgetDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.enums.FeElementType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 07-Feb-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyBudgetSummaryDto extends RecordDto {

	private FeElementDto monthlyBudget;

	private FeElementDto mir;

	private FeElementDto budgetedCostPerStudent;

	private FeElementDto costPerStudent;

	private FeElementDto costUtilization;

	private FeElementDto budgetUtilization;

	public MonthlyBudgetSummaryDto(MonthlyBudgetDto monthlyBudgetDto, int numberOfDaysInMonth) {

		this.monthlyBudget =
				new FeElementDto(((monthlyBudgetDto.getCostDto().getBudgetedMealCost() / monthlyBudgetDto.getDaysConsidered()) * numberOfDaysInMonth) / 1000, FeElementType.CURRENCY_INTEGER);
		this.mir = new FeElementDto(monthlyBudgetDto.getCostDto().getMovedInResidents(), FeElementType.INTEGER);

		this.budgetedCostPerStudent = new FeElementDto(monthlyBudgetDto.getCostDto().getBudgetedMealCost(), monthlyBudgetDto.getCostDto().getMovedInResidents(), false, FeElementType.CURRENCY_INTEGER);
		this.costPerStudent = new FeElementDto(monthlyBudgetDto.getCostDto().getTotalMealCost(), monthlyBudgetDto.getCostDto().getMovedInResidents(), false, FeElementType.CURRENCY_INTEGER);

		this.costUtilization = new FeElementDto(monthlyBudgetDto.getCostDto().getTotalMealCost(), monthlyBudgetDto.getCostDto().getExpectedMealCost(), false, FeElementType.PERCENT_DOUBLE);
		this.budgetUtilization = new FeElementDto(monthlyBudgetDto.getCostDto().getTotalMealCost(), monthlyBudgetDto.getCostDto().getBudgetedMealCost(), false, FeElementType.PERCENT_DOUBLE);

	}
}