package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class MealAttendanceUtilizationDto {
	
	private String mealName;
	
	private Integer attendance;
	
	private Double plannedUtilization;
	
	private Double actualUtilization;
	
}
