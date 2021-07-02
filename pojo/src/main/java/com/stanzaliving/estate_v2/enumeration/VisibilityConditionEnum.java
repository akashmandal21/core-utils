package com.stanzaliving.estate_v2.enumeration;

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
