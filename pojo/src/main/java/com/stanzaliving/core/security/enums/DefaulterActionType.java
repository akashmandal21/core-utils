package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum DefaulterActionType {
    CALLED_RESIDENT("Called-resident"),
    CALL_OUTCOME("Call-outcome"),
    VISITED_ROOM("Visited-room"),
    APPLIED_LEAVE("Applied leave"),
    APPLIED_LATE_ENTRY("Applied late-entry"),
    RESIDENT_ACTIVITY("Resident activity"),
    OTHER("other");

    private final String label;

    DefaulterActionType(String label) {
        this.label = label;
    }
}
