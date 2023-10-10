package com.stanzaliving.projectplanningservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlanningStatus {
    ACTIVE("active"),
    INACTIVE("inactive"),
    DRAFT("draft"),
    PENDINGAPPROVAL("pendingapproval"),
    APPROVED("approved"),
    REJECT("reject"),
    ARCHIVED("archived");

    private String status;
}
