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
    private Integer serviceMixCountStayCuration = 0;
    @Builder.Default
    private Integer underWrittenCount = 0;
    @Builder.Default
    private Integer transformationCount = 0;
    @Builder.Default
    private Integer foodCategoriesCount = 0;
    @Builder.Default
    private Integer foodCategoriesCountV2 = 0;
    @Builder.Default
    private Integer monthlyUnderWrittenCount = 0;
    @Builder.Default
    private Integer weeklyMenuCount = 0;
    @Builder.Default
    private Integer weeklyMenuCountV2 = 0;
    @Builder.Default
    private Integer monthlyBudgetMenuPlanningCount = 0;
    @Builder.Default
    private Integer electricityBillSplitterCount = 0;
    @Builder.Default
    private Integer dishDebarCount = 0;
    @Builder.Default
    private Integer dishReactivationCount = 0;
    
}
