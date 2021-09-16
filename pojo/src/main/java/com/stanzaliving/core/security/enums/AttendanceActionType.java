package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum AttendanceActionType {
    CALLED_RESIDENT("Called-resident"),
    VISITED_ROOM("Visited-room"),
    RESIDENT_MARKED_PRESENT("Resident-marked-present"),
    RESIDENT_ACTIVITY("Resident-activity"),
    MEAL_SCAN("Meal-scan");

    private final String label;

    private AttendanceActionType(String label){
        this.label=label;
    }
}
