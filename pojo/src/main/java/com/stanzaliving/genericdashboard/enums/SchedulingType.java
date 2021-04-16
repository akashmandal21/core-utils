package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SchedulingType {
    CUSTOM("Custom"),
    TRIGGER("Trigger");

    String type;


}
