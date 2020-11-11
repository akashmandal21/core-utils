package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserType {
    RESIDENT("Resident"),
    NON_RESIDENT("Non Resident");

    private final String type;
}
