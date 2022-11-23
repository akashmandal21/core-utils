package com.stanzaliving.core.utility.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MetricsType {

	DAILY_AVG_CONSUMPTION("Daily Average Consumption"),
	TOTAL_CONSUMPTION("Total Consumption"),
	PROCESS_ADHERENCE("Process Adherence"),
	BUDGET_UTILIZATION("Budget Utilization"),
	METER_COUNT("Meter Count"),
	TOTAL_EXPENSE("Total Expense");


	private String name;

}