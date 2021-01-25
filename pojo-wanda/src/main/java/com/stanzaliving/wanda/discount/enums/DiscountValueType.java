package com.stanzaliving.wanda.discount.enums;
public enum DiscountValueType {
    FIXED("Fixed"), VARIABLE("Variable");

    String name;

    DiscountValueType(String name) {
        this.name = name;
    }
}
