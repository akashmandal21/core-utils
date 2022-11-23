package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FieldType {

    ENUM("Enum Type"),
    BOOL("Yes/No"),
    YES_NO("Yes/No"),
    HIDDEN("Auto Calculated"),
    NONDECIMAL("Integer number"),
    DECIMAL("Decimal Number"),
    TEXT("Text"),
    LIST("list"),
    MAP("key value pairs"),
    TEMPLATE("Section"),
    OBJECT("Single Object"),
    PLACEHOLDER("Not For save"),
    ADAPT("Set using method"),
    ADAPT_RO("Readonly adapt");
    private String fieldTypeText;

}
