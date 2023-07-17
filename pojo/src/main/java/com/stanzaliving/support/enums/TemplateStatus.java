package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemplateStatus {
    APPROVED,
    PENDING_APPROVAL,
    REJECTED,
    IN_DRAFT
}
