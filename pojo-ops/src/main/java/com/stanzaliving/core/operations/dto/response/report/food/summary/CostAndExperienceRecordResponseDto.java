package com.stanzaliving.core.operations.dto.response.report.food.summary;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.CostAndExperienceRecordDto;
import com.stanzaliving.core.operations.dto.report.food.summary.SummaryRecordDto;
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
public class CostAndExperienceRecordResponseDto extends RecordDto {

    FeElementDto movedInResidence;

    FeElementDto unsatisfied;

    FeElementDto satisfied;

    FeElementDto socialMediaComplaint;

    FeElementDto disasterEvent;

    FeElementDto processAdherence;

    FeElementDto budgetUtilization;

    FeElementDto costUtilization;

    FeElementDto costPerMIR;

    public CostAndExperienceRecordResponseDto(SummaryRecordDto summaryRecordDto) {
    	super(summaryRecordDto);
        CostAndExperienceRecordDto costAndExperienceRecordDto = summaryRecordDto.getCostAndExperienceRecordDto();
        this.movedInResidence = new FeElementDto(costAndExperienceRecordDto.getMovedInResidence());
        this.unsatisfied = new FeElementDto(costAndExperienceRecordDto.getUnsatisfied(), costAndExperienceRecordDto.getSatisfied() + costAndExperienceRecordDto.getUnsatisfied());
        this.satisfied = new FeElementDto(costAndExperienceRecordDto.getSatisfied(), costAndExperienceRecordDto.getSatisfied() + costAndExperienceRecordDto.getUnsatisfied());
        this.socialMediaComplaint = new FeElementDto(costAndExperienceRecordDto.getSocialMediaComplaint());
        this.disasterEvent = new FeElementDto(costAndExperienceRecordDto.getDisasterEvent());
        this.budgetUtilization = new FeElementDto(costAndExperienceRecordDto.getTotalMealCost(), costAndExperienceRecordDto.getBudgetedMealCost());
        double averageCost = costAndExperienceRecordDto.getOccupiedBeds() != 0 ? costAndExperienceRecordDto.getTotalMealCost() / costAndExperienceRecordDto.getTotalMealsOrdered() : 0;
        this.costUtilization = new FeElementDto(costAndExperienceRecordDto.getTotalMealCost(), averageCost*costAndExperienceRecordDto.getOccupiedBeds());
        this.costPerMIR = new FeElementDto((double)costAndExperienceRecordDto.getTotalMealCost(), (double)costAndExperienceRecordDto.getMovedInResidence(),false, FeElementType.DOUBLE);
    }
}
