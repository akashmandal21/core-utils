package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Getter
public enum ConsumptionPattern {

    TIME_BASED("Time Based"),
    ONE_TIME("One Time"),
    MULTIPLE("Multiple"),
    DELIVERY_BASED("Delivery Based"),
    NA("Not Applicable");

    private String consumptionPatternText;

    public static Map<String, ConsumptionPattern> consumptionPatternByNameMap = new HashMap<>();

    static {

        for (ConsumptionPattern consumptionPattern : ConsumptionPattern.values()) {
            consumptionPatternByNameMap.put(consumptionPattern.getConsumptionPatternText(), consumptionPattern);
        }
    }

    public static ConsumptionPattern getConsumptionPatternByName(String consumptionPatternTypeName) {
        return consumptionPatternByNameMap.get(consumptionPatternTypeName);
    }

}
