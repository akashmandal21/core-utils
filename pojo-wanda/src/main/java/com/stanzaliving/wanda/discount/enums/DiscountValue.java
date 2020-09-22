package com.stanzaliving.wanda.discount.enums;

public enum DiscountValue {
    ABSOLUTE("Absolute"), PERCENT_OF_MONTHLY_RENT("% of monthly rent");

    String name;

    DiscountValue(String name) {
        this.name = name;
    }
}
