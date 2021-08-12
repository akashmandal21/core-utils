package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;


@Getter
@AllArgsConstructor
public enum Type {

    DATETIME("DateTime"),
    STRING("String"),
    INT("Int"),
    FLOAT("Float"),
    ARRAY("Array");

    private String type;
    @Override
    public String toString() {
        return type;
    }
    private static Map<String, com.stanzaliving.generictaskservice.enums.Type> typeTypeByStr = new HashMap<>();
}