package com.stanzaliving.core.security.enums;

public enum AttendanceActionType {
    CALLED_RESIDENT("Directly called and confirmed with resident"),
    VISITED_ROOM("Visited room & verified");

    public final String label;

    private AttendanceActionType(String label){
        this.label=label;
    }
}
