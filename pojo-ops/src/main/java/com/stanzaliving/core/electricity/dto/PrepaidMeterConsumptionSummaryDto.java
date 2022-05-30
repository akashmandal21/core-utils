package com.stanzaliving.core.electricity.dto;

import java.io.Serializable;
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
public class PrepaidMeterConsumptionSummaryDto implements Serializable {

	private static final long serialVersionUID = -7505221201516109282L;
	private Double l3DayAvgConsumption;
	private Double l7DayAvgConsumption;
	private Double l30DayAvgConsumption;
	
	private Double avgUnitConsumedPerMonth;
	private Double avgUnitConsumedPerDay;
	private Double blendedUnitRate;
	
	Map<Integer, Map<Month, List<PrepaidMeterDailyConsumptionDto>>> dailyConsumptionMap;
	
	
	
}
