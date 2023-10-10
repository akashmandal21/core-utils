package com.stanzaliving.sfr.enumeration;

import lombok.Getter;

@Getter
public enum VisibilityConditionEnum {

    CITY("city"),
    MICROMARKET("micromarket"),
    ROLES("roles"),
    STATUS("status"),
    QUESTION_VARIABLE("questionVariables");

    private final String name;

    VisibilityConditionEnum(String name) {
        this.name = name;
    }


}
