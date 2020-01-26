package com.stanzaliving.core.operations.dto.response.report.food;

import java.util.Map;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.CostUtilizationRecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.DateLevelNumbersDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.enums.FeElementType;
import com.stanzaliving.core.operations.utils.FoodReportUtil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostUtilizationRecordResponseDto extends RecordDto {

	private MealResponseDto budgetUtilization;

	private MealResponseDto costPerBed;

	private MealResponseDto costUtilizationPerBed;

	public CostUtilizationRecordResponseDto(AccessLevel accessLevel, CostUtilizationRecordDto costUtilizationRecordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap, int daysConsidered) {
		super(costUtilizationRecordDto);

		Integer occupied = FoodReportUtil.getOccupiedBedCount(accessLevel, costUtilizationRecordDto, dateLevelFieldsMap) / daysConsidered;

		this.budgetUtilization = MealResponseDto.builder()
				.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), costUtilizationRecordDto.getBudgetedCost().getOverall(), FeElementType.PERCENT_INTEGER))
				.breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), costUtilizationRecordDto.getBudgetedCost().getBreakfast(), FeElementType.PERCENT_INTEGER))
				.lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), costUtilizationRecordDto.getBudgetedCost().getLunch(), FeElementType.PERCENT_INTEGER))
				.snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), costUtilizationRecordDto.getBudgetedCost().getSnacks(), FeElementType.PERCENT_INTEGER))
				.dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), costUtilizationRecordDto.getBudgetedCost().getDinner(), FeElementType.PERCENT_INTEGER))
				.brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), costUtilizationRecordDto.getBudgetedCost().getBrunch(), FeElementType.PERCENT_INTEGER))
				.build();

		this.costPerBed = MealResponseDto.builder()
				.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), occupied, false, FeElementType.CURRENCY_INTEGER))
				.breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), occupied, false, FeElementType.CURRENCY_INTEGER))
				.lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), occupied, false, FeElementType.CURRENCY_INTEGER))
				.snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), occupied, false, FeElementType.CURRENCY_INTEGER))
				.dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), occupied, false, FeElementType.CURRENCY_INTEGER))
				.brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), occupied, false, FeElementType.CURRENCY_INTEGER))
				.build();

		double averageOverallCost = costUtilizationRecordDto.getTotalCost().getOverall() / costUtilizationRecordDto.getOrderCount().getOverall();
		double averageBreakfastCost = costUtilizationRecordDto.getTotalCost().getBreakfast() / costUtilizationRecordDto.getOrderCount().getBreakfast();
		double averageLunchCost = costUtilizationRecordDto.getTotalCost().getLunch() / costUtilizationRecordDto.getOrderCount().getLunch();
		double averageSnacksCost = costUtilizationRecordDto.getTotalCost().getSnacks() / costUtilizationRecordDto.getOrderCount().getSnacks();
		double averageDinnerCost = costUtilizationRecordDto.getTotalCost().getDinner() / costUtilizationRecordDto.getOrderCount().getDinner();
		double averageBrunchCost = costUtilizationRecordDto.getTotalCost().getBrunch() / costUtilizationRecordDto.getOrderCount().getBrunch();

		this.costUtilizationPerBed = MealResponseDto.builder()
				.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), averageOverallCost * occupied, FeElementType.PERCENT_INTEGER))
				.breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), averageBreakfastCost * occupied, FeElementType.PERCENT_INTEGER))
				.lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), averageLunchCost * occupied, FeElementType.PERCENT_INTEGER))
				.snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), averageSnacksCost * occupied, FeElementType.PERCENT_INTEGER))
				.dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), averageDinnerCost * occupied, FeElementType.PERCENT_INTEGER))
				.brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), averageBrunchCost * occupied, FeElementType.PERCENT_INTEGER))
				.build();
	}

}