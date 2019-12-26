package com.stanzaliving.core.leadership.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@Setter
@AllArgsConstructor
@ToString
public class RoceChartPoint {

	private Integer expectedMonths;
	
	private Integer numberOfBeds;
	
	private Double capexCost;
	
	private String propertyName;
	
}
