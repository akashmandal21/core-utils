package com.stanzaliving.estate_v2.enumeration;

import lombok.Getter;

@Getter
public enum Module {
    SALES_REVIEW("6092dfdde07ea4fe6b92e2b9"),
    LEGAL_DEVIATION("6092e037500eaa2651d69de5"),
    INITIAL_BED_TEST("6092e046500eaa2651d69de6"),
    PROPERTY_NAMING("6092e058500eaa2651d69de7");

    private final String uuid;

    Module(String uuid) {
        this.uuid = uuid;
    }
}
