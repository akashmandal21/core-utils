package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.CostUtilizationRecordDto;
import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
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
                .overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), costUtilizationRecordDto.getOccupiedBeds()))
                .breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), costUtilizationRecordDto.getOccupiedBeds()))
                .lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), costUtilizationRecordDto.getOccupiedBeds()))
                .snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), costUtilizationRecordDto.getOccupiedBeds()))
                .dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), costUtilizationRecordDto.getOccupiedBeds()))
                .brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), costUtilizationRecordDto.getOccupiedBeds()))
                .build();

        double averageOverallCost = costUtilizationRecordDto.getTotalCost().getOverall() / costUtilizationRecordDto.getOrderCount().getOverall();
        double averageBreakfastCost = costUtilizationRecordDto.getOrderCount().getBreakfast() / costUtilizationRecordDto.getOrderCount().getOverall();
        double averageLunchCost = costUtilizationRecordDto.getOrderCount().getLunch() / costUtilizationRecordDto.getOrderCount().getOverall();
        double averageSnacksCost = costUtilizationRecordDto.getOrderCount().getSnacks() / costUtilizationRecordDto.getOrderCount().getOverall();
        double averageDinnerCost = costUtilizationRecordDto.getOrderCount().getDinner() / costUtilizationRecordDto.getOrderCount().getOverall();
        double averageBrunchCost = costUtilizationRecordDto.getOrderCount().getBrunch() / costUtilizationRecordDto.getOrderCount().getOverall();

        this.costUtilizationPerBed = MealResponseDto.builder()
                .overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), averageOverallCost * costUtilizationRecordDto.getOccupiedBeds()))
                .breakfast(new FeElementDto(costUtilizationRecordDto.getOrderCount().getBreakfast(), averageBreakfastCost * costUtilizationRecordDto.getOccupiedBeds()))
                .lunch(new FeElementDto(costUtilizationRecordDto.getOrderCount().getLunch(), averageLunchCost * costUtilizationRecordDto.getOccupiedBeds()))
                .snacks(new FeElementDto(costUtilizationRecordDto.getOrderCount().getSnacks(), averageSnacksCost * costUtilizationRecordDto.getOccupiedBeds()))
                .dinner(new FeElementDto(costUtilizationRecordDto.getOrderCount().getDinner(), averageDinnerCost * costUtilizationRecordDto.getOccupiedBeds()))
                .brunch(new FeElementDto(costUtilizationRecordDto.getOrderCount().getBrunch(), averageBrunchCost * costUtilizationRecordDto.getOccupiedBeds()))
                .build();
    }

}
