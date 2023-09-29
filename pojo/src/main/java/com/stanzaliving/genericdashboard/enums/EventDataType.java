package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventDataType {
    PERCENTAGE("Percentage"),
    INTEGER("Integer"),
    DOUBLE("Double"),
    STRING("String"),
    LIST_STRING("List of String"),
    LIST_DOUBLE("List Of Double"),
    LIST_INTEGER("List Of Integer"),
    DATE("Date"),
    TIME("Time"),
    OBJECT("Object"),
    DATE_TIME("Date Time"),
    BOOLEAN("Boolean");

    String eventDataType;
}
