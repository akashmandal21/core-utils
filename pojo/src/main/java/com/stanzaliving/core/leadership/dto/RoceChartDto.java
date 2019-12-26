package com.stanzaliving.core.leadership.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class RoceChartDto {

	private RoceChartPoint currentProperty;
	
	private List<RoceChartPoint> roceChartPoints;
}
