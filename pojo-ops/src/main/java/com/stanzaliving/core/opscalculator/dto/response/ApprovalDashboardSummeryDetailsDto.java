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
    private Integer serviceMixCount;
    private Integer underWrittenCount;
    private Integer transformationCount;
    private Integer foodCategoriesCount;
    private Integer monthlyUnderWrittenCount;

}
