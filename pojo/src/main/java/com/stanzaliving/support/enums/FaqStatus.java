package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FaqStatus {
    APPROVED,
    PENDING_APPROVAL,
    REJECTED,
    IN_DRAFT
}
