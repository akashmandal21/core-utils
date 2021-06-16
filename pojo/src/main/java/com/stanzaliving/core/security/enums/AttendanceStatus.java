package com.stanzaliving.core.security.enums;

public enum AttendanceStatus {
    PRESENT("Present"),
    ABSENT("Absent"),
    EXEMPTED("Exempted");

    private final String label;

    private AttendanceStatus(String label){
        this.label = label;
    }
}

