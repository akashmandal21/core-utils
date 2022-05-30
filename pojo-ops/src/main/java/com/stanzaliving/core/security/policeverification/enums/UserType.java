package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserType {

    STUDENT("Student"),
    WORKING("Working"),
    OTHERS("Others");

    private final String userTypeName;
}
