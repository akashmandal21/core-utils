package com.stanzaliving.core.security.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public enum RequestStatus {
    AUTO_APPROVED("Auto-approved"),
    APPROVED("Approved"),
    PENDING("Pending"),
    REJECTED("Rejected"),
    CANCELLED("Cancelled"),
    AUTO_REJECTED("Auto-rejected");

    private final String label;

    private RequestStatus(String label) {
        this.label = label;
    }

    public static List<RequestStatus> getApprovedStatusList() {
        return new ArrayList<>(Arrays.asList(RequestStatus.AUTO_APPROVED, RequestStatus.APPROVED));
    }
}
