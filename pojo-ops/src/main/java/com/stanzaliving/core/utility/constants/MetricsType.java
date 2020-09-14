package com.stanzaliving.core.utility.constants;

public enum MetricsType {
    DAILY_AVG_CONSUMPTION("Daily Average Consumption"),
    TOTAL_CONSUMPTION("Total Consumption"),
    PROCESS_ADHERENCE("Process Adherence"),
    BUDGET_UTILIZATION("Budget Utilization"),
    TOTAL_EXPENSE("Total Expense");
    private final String name;

    MetricsType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
