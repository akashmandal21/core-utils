package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Nationality {

    INDIAN("IN"),
    FOREIGN("FN");

    private final String name;

}
