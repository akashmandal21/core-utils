package com.stanzaliving.core.inventory_transformations.model;

import java.util.HashMap;
import java.util.Map;

public enum RiskType {
    VERY_HIGH_RISK("Very High Risk", 0),
    HIGH_RISK("High Risk", 1),
    MEDIUM_RISK("Medium Risk", 2),
    LOW_RISK("Low Risk", 3),
    NO_RISK("No Risk", 4);
    public String description;
    public Integer value;
    private static final Map<Integer, RiskType> map = new HashMap<>();

    static {
        for (RiskType riskType : values()) map.put(riskType.value, riskType);
    }

    RiskType(String riskDesc, Integer value) {
        this.description = riskDesc;
        this.value = value;
    }

    public static RiskType getRiskType(Integer value) {
        RiskType result = map.get(value);
        if (result == null) {
            return NO_RISK;
        }
        return result;
    }
}
