package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TeamType {

    S("S", "System"),
    N("N", "Nodal Team"),
    RC("RC", "Residence Captain"),
    L("L","Legal Team");

    private final String key;
    private final String value;
}
