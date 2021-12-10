package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;


@Getter
@AllArgsConstructor
public enum CorrelationCategory {
    DEMAND_SCHOLAR("Demand (Scholar)"),
    DEMAND_SUITS("Demand (Suits)"),
    DEMAND_S21("Demand (S21)"),
    SUPPLY_SCHOLAR("Supply (Scholar)"),
    SUPPLY_SUITS("Supply (Suits)"),
    SUPPLY_S21("Supply (S21)");

    private static final SortedMap<String, CorrelationCategory> correlationCategoryMap = new TreeMap<String, CorrelationCategory>();

    static {
        for (CorrelationCategory correlationCategory : CorrelationCategory.values()) {
            correlationCategoryMap.put(correlationCategory.getCorrelationCategoryName(), correlationCategory);
        }
    }

    private final String CorrelationCategoryName;

    public static Collection<CorrelationCategory> getCorrelationCategory() {
        return correlationCategoryMap.values();
    }
}
