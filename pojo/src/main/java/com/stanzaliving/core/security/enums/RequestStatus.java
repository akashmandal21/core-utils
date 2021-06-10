package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum RequestStatus {
    AUTO_APPROVED("Auto-approved"),
    APPROVED("Approved"),
    PENDING("Pending"),
    REJECTED("Rejected"),
    CANCELLED("Cancelled");

    private final String label;

    private RequestStatus(String label) {
        this.label = label;
    }
}
