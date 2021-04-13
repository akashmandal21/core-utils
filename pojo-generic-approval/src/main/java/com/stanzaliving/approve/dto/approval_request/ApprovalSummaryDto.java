package com.stanzaliving.approve.dto.approval_request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApprovalSummaryDto {

    @Builder.Default
    private Integer pendingL1Approval = 0;

    @Builder.Default
    private Integer pendingL2Approval = 0;

    @Builder.Default
    private Integer pendingL3Approval = 0;

    @Builder.Default
    private Integer pendingL4Approval = 0;

    @Builder.Default
    private Integer pendingL5Approval = 0;

    @Builder.Default
    private Integer approval  = 0;

    @Builder.Default
    private Integer rejection  = 0;

    @Builder.Default
    private Integer totalPendingRequest = 0;

    @Builder.Default
    private Integer roomUpdates = 0;

    @Builder.Default
    private Integer residenceUpdates  = 0;
}
