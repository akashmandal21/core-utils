package com.stanzaliving.core.electricity.dto;

import java.time.Month;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class PrepaidMeterConsumptionSummaryDto {

	private Double l3DayAvgConsumption;
	private Double l7DayAvgConsumption;
	private Double l30DayAvgConsumption;
	
	private Double avgUnitConsumedPerMonth;
	private Double avgUnitConsumedPerDay;
	
	Map<Integer, Map<Month, List<PrepaidMeterDailyConsumptionDto>>> dailyConsumptionMap;
	
	
	
}
