package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WaitTimeUnit {
    MINUTES("Minutes"),
    HOURS("Hours"),
    DAYS("Days");

    String waitTime;

}