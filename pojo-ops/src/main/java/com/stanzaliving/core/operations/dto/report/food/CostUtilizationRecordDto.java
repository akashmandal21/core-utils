package com.stanzaliving.core.operations.dto.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostUtilizationRecordDto extends RecordDto {

    MealPercentColorDto budgetUtilization;

    MealDto costPerBed;

    MealPercentColorDto costUtilizationPerBed;

}
