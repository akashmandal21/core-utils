package com.stanzaliving.core.security.enums;

public enum RequestStatus {
    AUTO_APPROVED("Auto-approved"),
    APPROVED("Approved"),
    PENDING("Pending"),
    REJECTED("Rejected"),
    CANCELLED("Cancelled");

    public final String label;

    private RequestStatus(String label) {
        this.label = label;
    }
}
