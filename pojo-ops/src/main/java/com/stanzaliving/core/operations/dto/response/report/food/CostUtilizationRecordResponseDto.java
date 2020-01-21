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
    			.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), costUtilizationRecordDto.getExpectedCost().getOverall()))
    			.breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), costUtilizationRecordDto.getExpectedCost().getBreakfast()))
    			.lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), costUtilizationRecordDto.getExpectedCost().getLunch()))
    			.snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), costUtilizationRecordDto.getExpectedCost().getSnacks()))
    			.dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), costUtilizationRecordDto.getExpectedCost().getDinner()))
    			.brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), costUtilizationRecordDto.getExpectedCost().getBrunch()))
    			.build();
    	this.costPerBed = MealResponseDto.builder()
    			.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), costUtilizationRecordDto.getOccupiedBeds()))
    			.breakfast(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBreakfast(), costUtilizationRecordDto.getOccupiedBeds()))
    			.lunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getLunch(), costUtilizationRecordDto.getOccupiedBeds()))
    			.snacks(new FeElementDto(costUtilizationRecordDto.getTotalCost().getSnacks(), costUtilizationRecordDto.getOccupiedBeds()))
    			.dinner(new FeElementDto(costUtilizationRecordDto.getTotalCost().getDinner(), costUtilizationRecordDto.getOccupiedBeds()))
    			.brunch(new FeElementDto(costUtilizationRecordDto.getTotalCost().getBrunch(), costUtilizationRecordDto.getOccupiedBeds()))
    			.build();
    	this.costUtilizationPerBed = MealResponseDto.builder()
    			.overall(new FeElementDto(costUtilizationRecordDto.getTotalCost().getOverall(), 5*costUtilizationRecordDto.getOccupiedBeds()))
    			.breakfast(new FeElementDto(costUtilizationRecordDto.getOrderCount().getBreakfast(), costUtilizationRecordDto.getOccupiedBeds()))
    			.lunch(new FeElementDto(costUtilizationRecordDto.getOrderCount().getLunch(), costUtilizationRecordDto.getOccupiedBeds()))
    			.snacks(new FeElementDto(costUtilizationRecordDto.getOrderCount().getSnacks(), costUtilizationRecordDto.getOccupiedBeds()))
    			.dinner(new FeElementDto(costUtilizationRecordDto.getOrderCount().getDinner(), costUtilizationRecordDto.getOccupiedBeds()))
    			.brunch(new FeElementDto(costUtilizationRecordDto.getOrderCount().getBrunch(), costUtilizationRecordDto.getOccupiedBeds()))
    			.build();
    }
    
    
    

}
