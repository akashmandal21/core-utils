package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum AttendanceStatus {
    PRESENT("Present"),
    ABSENT("Absent"),
    EXEMPTED("Exempted"),
    NOT_AVAILABLE("Not available"),
    LEAVE("Leave"),
    LATE_ENTRY("Late entry");
  
    private final String label;

    private AttendanceStatus(String label){
        this.label = label;
    }
}

