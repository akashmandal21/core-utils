package com.stanzaliving.approval.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PendingApprovalSummaryDto {
    @Builder.Default
    private Integer serviceMixCount = 0;
    @Builder.Default
    private Integer underWrittenCount = 0;
    @Builder.Default
    private Integer transformationCount = 0;
    @Builder.Default
    private Integer foodCategoriesCount = 0;
    @Builder.Default
    private Integer monthlyUnderWrittenCount = 0;
}
