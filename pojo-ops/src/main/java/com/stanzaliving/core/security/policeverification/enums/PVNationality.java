package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PVNationality {

    IN("INDIAN"),
    FN("FOREIGN");

    private final String name;

}
