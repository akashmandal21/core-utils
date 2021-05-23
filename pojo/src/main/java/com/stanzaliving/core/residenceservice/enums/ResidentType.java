package com.stanzaliving.core.residenceservice.enums;

public enum ResidentType {
    PROFESSIONAL("Professional"),
    SCHOLAR("Scholar");

    private String name;

    private ResidentType(String stringVal) {
        name = stringVal;
    }
    public String enumValue() {
        return name;
    }

}
