package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PVApplicable {

    ONLINE("Online"),
    OFFLINE("Offline"),
    FRRO("FRRO"),
    EXCEL("Excel");

    private final String name;
}
