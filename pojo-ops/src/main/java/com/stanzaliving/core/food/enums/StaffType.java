package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StaffType {
    SL_STAFF("SL Staff"),
    NON_SL_STAFF("Non-SL Staff");

    private String label;
}
