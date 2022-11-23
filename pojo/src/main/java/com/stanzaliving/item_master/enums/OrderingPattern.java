package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Getter
public enum OrderingPattern {

    ONE_TIME("One Time"),
    MULTIPLE("Multiple");

    private String orderingPatternText;

    public static Map<String, OrderingPattern> orderingPatternByNameMap = new HashMap<>();

    static {

        for (OrderingPattern orderingPattern : OrderingPattern.values()) {
            orderingPatternByNameMap.put(orderingPattern.getOrderingPatternText(), orderingPattern);
        }
    }

    public static OrderingPattern getOrderingPatternByName(String orderingPatternTypeName) {
        return orderingPatternByNameMap.get(orderingPatternTypeName);
    }

}
