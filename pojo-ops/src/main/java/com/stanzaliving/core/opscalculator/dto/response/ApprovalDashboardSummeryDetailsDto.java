package com.stanzaliving.core.opscalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApprovalDashboardSummeryDetailsDto {
    private int serviceMixCount;
    private int underWrittenCount;
    private int transformationCount;
    private int foodCategoriesCount;
    private int monthlyUnderWrittenCount;

}
