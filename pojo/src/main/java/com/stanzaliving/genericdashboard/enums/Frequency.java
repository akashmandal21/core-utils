package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Frequency {
    MONTHLY("Monthly"),
    DAILY("Daily");

    String schedulingFrequency;

}
