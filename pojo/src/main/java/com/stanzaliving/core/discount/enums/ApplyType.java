package com.stanzaliving.core.discount.enums;

public enum ApplyType {
    OPTIONAL("Optional"), AUTOMATIC("Automatic");

    String name;

    ApplyType(String name) {
        this.name = name;
    }
}
