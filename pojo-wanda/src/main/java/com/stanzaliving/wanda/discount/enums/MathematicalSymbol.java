package com.stanzaliving.wanda.discount.enums;
public enum MathematicalSymbol {
    GREATER_THAN_EQUAL_TO("greater than equal to"), EQUAL_TO("equal to");

    String name;

    MathematicalSymbol(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
