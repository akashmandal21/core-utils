package com.stanzaliving.core.operations.dto.report.food.summary;

import com.stanzaliving.core.operations.dto.report.PercentDto;
import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostAndExperienceRecordDto extends RecordDto {

    int movedInResidence;

    int unsatisfied;

    int satisfied;

    int socialMediaComplaint;

    int disasterEvent;

    int processAdherence;

    double totalMealCost;
    
    double budgetedMealCost;
    
    int occupiedBeds;
    
    int totalMealsOrdered;

}
