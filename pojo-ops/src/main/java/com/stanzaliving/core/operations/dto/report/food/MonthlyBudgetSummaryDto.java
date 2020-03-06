/**
 * 
 */
package com.stanzaliving.core.operations.dto.report.food;

import java.util.Map;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.DateLevelNumbersDto;
import com.stanzaliving.core.operations.dto.report.food.summary.MonthlyBudgetDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.enums.FeElementType;
import com.stanzaliving.core.operations.utils.FoodReportUtil;

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

	public MonthlyBudgetSummaryDto(AccessLevel accessLevel, MonthlyBudgetDto monthlyBudgetDto, int numberOfDaysInMonth, Map<String, DateLevelNumbersDto> dateLevelFieldsMap) {

		int mir = FoodReportUtil.getMIRCount(accessLevel, monthlyBudgetDto, dateLevelFieldsMap);

		this.monthlyBudget =
				new FeElementDto(((monthlyBudgetDto.getCostDto().getBudgetedMealCost() / monthlyBudgetDto.getDaysConsidered()) * numberOfDaysInMonth) / 1000, FeElementType.CURRENCY_INTEGER);
		this.mir = new FeElementDto(mir, FeElementType.INTEGER);

		this.budgetedCostPerStudent = new FeElementDto(monthlyBudgetDto.getCostDto().getBudgetedMealCost(), mir, false, FeElementType.CURRENCY_INTEGER);
		this.costPerStudent = new FeElementDto(monthlyBudgetDto.getCostDto().getTotalMealCost(), mir, false, FeElementType.CURRENCY_INTEGER);

		this.costUtilization = new FeElementDto(monthlyBudgetDto.getCostDto().getTotalMealCost(), monthlyBudgetDto.getCostDto().getExpectedMealCost());
		this.budgetUtilization = new FeElementDto(monthlyBudgetDto.getCostDto().getTotalMealCost(), monthlyBudgetDto.getCostDto().getBudgetedMealCost());

	}
}