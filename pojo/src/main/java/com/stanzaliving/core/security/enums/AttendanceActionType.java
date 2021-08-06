package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum AttendanceActionType {
    CALLED_RESIDENT("Directly called and confirmed with resident"),
    RESIDENT_ACTIVITY("Resident-activity"),
    VISITED_ROOM("Visited room & verified");

    private final String label;

    private AttendanceActionType(String label){
        this.label=label;
    }
}
