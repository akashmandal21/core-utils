package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum Type {

    DATE_TIME("Date Time"),
    STRING("String"),
    INTEGER("Integer"),
    FLOAT("Float"),
    DOUBLE("Double"),
    DATE("Date"),
    TIME("Time"),
    BOOLEAN("Boolean"),
    ARRAY("Array"),
    LIST_STRING("List of String"),
    List_INTEGER("List Of Integer"),
    LIST_DOUBLE("List of Double"),
    JSON("Json");

    private String type;
    @Override
    public String toString() {
        return type;
    }
}