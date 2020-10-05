package com.stanzaliving.core.opscalculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApprovalStatus {
    PENDING_APPROVAL_ON_L1, PENDING_APPROVAL_ON_L2, REJECTED_BY_L1, REJECTED_BY_L2, APPROVED_BY_L1, APPROVED_BY_L2;
}
