package com.stanzaliving.core.operations.dto.response.report.food;

import com.stanzaliving.core.operations.dto.report.RecordDto;
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

}
