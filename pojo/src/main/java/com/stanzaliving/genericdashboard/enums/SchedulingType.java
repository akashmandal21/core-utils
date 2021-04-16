package com.stanzaliving.genericdashboard.enums;

public enum SchedulingType {
    CUSTOM("CUSTOM"),
    TRIGGER("TRIGGER");

    public String schedulingType;

    SchedulingType(String schedulingType) {
        this.schedulingType = schedulingType;
    }
}
