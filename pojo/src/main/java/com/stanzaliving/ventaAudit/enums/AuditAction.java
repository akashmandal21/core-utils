package com.stanzaliving.ventaAudit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuditAction {
    CONDUCTED("Conducted"),
    UPDATED("Updated"),
    APPROVED("Approved"),
    REJECTED("Rejected");
    private final String actionName;
}
