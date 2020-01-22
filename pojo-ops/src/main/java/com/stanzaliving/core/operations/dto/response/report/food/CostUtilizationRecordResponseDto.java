package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.CostUtilizationRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import com.stanzaliving.core.operations.enums.FeElementType;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostUtilizationRecordResponseDto extends RecordDto {

    MealResponseDto budgetUtilization;

    MealResponseDto costPerBed;

    MealResponseDto costUtilizationPerBed;

    public CostUtilizationRecordResponseDto(CostUtilizationRecordDto costUtilizationRecordDto) {
        this.budgetUtilization = MealResponseDto.builder()
                .overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), costUtilizationRecordDto.getExpectedCost().getOverall() * 0.7))
                .breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), costUtilizationRecordDto.getExpectedCost().getBreakfast() * 0.7))
                .lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), costUtilizationRecordDto.getExpectedCost().getLunch() * 0.7))
                .snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), costUtilizationRecordDto.getExpectedCost().getSnacks() * 0.7))
                .dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), costUtilizationRecordDto.getExpectedCost().getDinner() * 0.7))
                .brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), costUtilizationRecordDto.getExpectedCost().getBrunch() * 0.7))
                .build();
        this.costPerBed = MealResponseDto.builder()
        		.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), costUtilizationRecordDto.getOccupiedBeds(), false, FeElementType.DOUBLE))
                .breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), costUtilizationRecordDto.getOccupiedBeds(), false, FeElementType.DOUBLE))
                .lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), costUtilizationRecordDto.getOccupiedBeds(), false, FeElementType.DOUBLE))
                .snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), costUtilizationRecordDto.getOccupiedBeds(), false, FeElementType.DOUBLE))
                .dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), costUtilizationRecordDto.getOccupiedBeds(), false, FeElementType.DOUBLE))
                .brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), costUtilizationRecordDto.getOccupiedBeds(), false, FeElementType.DOUBLE))
                .build();

        double averageOverallCost = costUtilizationRecordDto.getTotalCost().getOverall() / costUtilizationRecordDto.getOrderCount().getOverall();
        double averageBreakfastCost = costUtilizationRecordDto.getTotalCost().getBreakfast() / costUtilizationRecordDto.getOrderCount().getBreakfast();
        double averageLunchCost = costUtilizationRecordDto.getTotalCost().getLunch() / costUtilizationRecordDto.getOrderCount().getLunch();
        double averageSnacksCost = costUtilizationRecordDto.getTotalCost().getSnacks() / costUtilizationRecordDto.getOrderCount().getSnacks();
        double averageDinnerCost = costUtilizationRecordDto.getTotalCost().getDinner() / costUtilizationRecordDto.getOrderCount().getDinner();
        double averageBrunchCost = costUtilizationRecordDto.getTotalCost().getBrunch() / costUtilizationRecordDto.getOrderCount().getBrunch();

        this.costUtilizationPerBed = MealResponseDto.builder()
                .overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), 5 * averageOverallCost * costUtilizationRecordDto.getOccupiedBeds()))
                .breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), averageBreakfastCost * costUtilizationRecordDto.getOccupiedBeds()))
                .lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), averageLunchCost * costUtilizationRecordDto.getOccupiedBeds()))
                .snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), averageSnacksCost * costUtilizationRecordDto.getOccupiedBeds()))
                .dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), averageDinnerCost * costUtilizationRecordDto.getOccupiedBeds()))
                .brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), averageBrunchCost * costUtilizationRecordDto.getOccupiedBeds()))
                .build();
    }

}
