package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorType {
    FORMAL("Value provided is not of required type or doesn't conform to field restrictions"),
    LOGICAL("Logical Error");

    private String errorTypeText;
}
