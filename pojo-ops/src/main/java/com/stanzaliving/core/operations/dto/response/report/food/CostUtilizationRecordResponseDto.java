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

	private MealResponseDto orderCount;

	private FeElementDto occupiedBeds;

	private FeElementDto mirCount;

	private FeElementDto averagePercentage;

	public CostUtilizationRecordResponseDto(AccessLevel accessLevel, CostUtilizationRecordDto costUtilizationRecordDto, Map<String, DateLevelNumbersDto> dateLevelFieldsMap, int daysConsidered) {
		super(costUtilizationRecordDto);

		Integer occupied = FoodReportUtil.getOccupiedBedCount(accessLevel, costUtilizationRecordDto, dateLevelFieldsMap);	//to be verified
		Integer mirCount = FoodReportUtil.getMIRCount(accessLevel, costUtilizationRecordDto, dateLevelFieldsMap);	//to be verified

		this.budgetUtilization = MealResponseDto.builder()
				.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), costUtilizationRecordDto.getBudgetedCost().getOverall(), FeElementType.PERCENT_INTEGER))
				.breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), costUtilizationRecordDto.getBudgetedCost().getBreakfast(), FeElementType.PERCENT_INTEGER))
				.lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), costUtilizationRecordDto.getBudgetedCost().getLunch(), FeElementType.PERCENT_INTEGER))
				.snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), costUtilizationRecordDto.getBudgetedCost().getSnacks(), FeElementType.PERCENT_INTEGER))
				.dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), costUtilizationRecordDto.getBudgetedCost().getDinner(), FeElementType.PERCENT_INTEGER))
				.build();

		this.costPerBed = MealResponseDto.builder()
				.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), mirCount, false, FeElementType.CURRENCY_INTEGER))
				.breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), mirCount, false, FeElementType.CURRENCY_INTEGER))
				.lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), mirCount, false, FeElementType.CURRENCY_INTEGER))
				.snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), mirCount, false, FeElementType.CURRENCY_INTEGER))
				.dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), mirCount, false, FeElementType.CURRENCY_INTEGER))
				.build();

//		double averageOverallCost = costUtilizationRecordDto.getTotalCost().getOverall();
//		double averageBreakfastCost = costUtilizationRecordDto.getTotalCost().getBreakfast() / occupied;
//		double averageLunchCost = costUtilizationRecordDto.getTotalCost().getLunch() / occupied;
//		double averageSnacksCost = costUtilizationRecordDto.getTotalCost().getSnacks() / occupied;
//		double averageDinnerCost = costUtilizationRecordDto.getTotalCost().getDinner() / occupied;

		this.costUtilizationPerBed = MealResponseDto.builder()
				.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), costUtilizationRecordDto.getExpectedCost().getOverall(), FeElementType.PERCENT_INTEGER))
				.breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), costUtilizationRecordDto.getExpectedCost().getBreakfast(), FeElementType.PERCENT_INTEGER))
				.lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), costUtilizationRecordDto.getExpectedCost().getLunch(), FeElementType.PERCENT_INTEGER))
				.snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), costUtilizationRecordDto.getExpectedCost().getSnacks(), FeElementType.PERCENT_INTEGER))
				.dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), costUtilizationRecordDto.getExpectedCost().getDinner(), FeElementType.PERCENT_INTEGER))
				.build();

		this.orderCount = MealResponseDto.builder()
				.overall(new FeElementDto(costUtilizationRecordDto.getOrderCount().getOverall(), FeElementType.PERCENT_INTEGER))
				.breakfast(new FeElementDto(costUtilizationRecordDto.getOrderCount().getBreakfast(), FeElementType.PERCENT_INTEGER))
				.lunch(new FeElementDto(costUtilizationRecordDto.getOrderCount().getLunch(), FeElementType.PERCENT_INTEGER))
				.snacks(new FeElementDto(costUtilizationRecordDto.getOrderCount().getSnacks(), FeElementType.PERCENT_INTEGER))
				.dinner(new FeElementDto(costUtilizationRecordDto.getOrderCount().getDinner(), FeElementType.PERCENT_INTEGER))
				.build();

		this.occupiedBeds = new FeElementDto(occupied, FeElementType.PERCENT_INTEGER);

		this.mirCount = new FeElementDto(mirCount, FeElementType.PERCENT_INTEGER);

		this.averagePercentage = new FeElementDto(costUtilizationRecordDto.getOrderCount().getOverall(), mirCount, FeElementType.PERCENT_INTEGER);

	}

}