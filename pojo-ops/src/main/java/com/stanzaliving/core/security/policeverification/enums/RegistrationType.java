package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum RegistrationType {

    ONLINE("Online"),
    OFFLINE("Offline"),
    NOT_OPERATIONAL("Not Operational");

    private final String name;
}
