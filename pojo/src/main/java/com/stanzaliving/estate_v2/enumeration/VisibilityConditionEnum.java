package com.stanzaliving.estate_v2.enumeration;

import lombok.Getter;

@Getter
public enum VisibilityConditionEnum {

    CITY("city"),
    MICROMARKETS("micromarkets"),
    ROLES("roles"),
    STATUS("status"),
    QUESTIONVARIABLES("questionVariables");

    private final String name;

    VisibilityConditionEnum(String name) {
        this.name = name;
    }


}
