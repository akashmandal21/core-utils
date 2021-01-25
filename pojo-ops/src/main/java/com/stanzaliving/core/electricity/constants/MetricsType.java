package com.stanzaliving.core.electricity.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  MetricsType {

    DAILY_AVG_CONSUMPTION("Daily Average Consumption"),
    TOTAL_CONSUMPTION("Total Consumption"),
    BUDGET_UTILIZATION("Budget Utilization"),
    METER_COUNT("Meter Count");

    private String name;
}
