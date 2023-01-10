package com.stanzaliving.core.ventaaggregationservice.enums;

public enum RiskProfile {

    HIGH("High risk"),
    MEDIUM("Medium risk"),
    LOW("Low risk"),
    NO("No risk");

    private String name;

    private RiskProfile(String stringVal) {
        name = stringVal;
    }

    public String enumValue() {
        return name;
    }

}
