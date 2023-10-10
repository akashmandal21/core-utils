package com.stanzaliving.sfr.enumeration;

import lombok.Getter;

@Getter
public enum Module {
    SALES_REVIEW("6092dfdde07ea4fe6b92e2b9", "Sales Review"),
    LEGAL_DEVIATION("6092e037500eaa2651d69de5", "Legal Deviations"),
    INITIAL_BED_TEST("6092e046500eaa2651d69de6", "Initial Bed Test"),
    PROPERTY_NAMING("6092e058500eaa2651d69de7", "Property Naming");

    private final String uuid;
    private final String name;

    Module(String uuid, String otherName) {
        this.uuid = uuid;
        this.name = otherName;
    }
}
