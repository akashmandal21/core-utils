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
public class StaffMealAttendanceUtilizationDto {

	private String mealName;

	private Double slStaffUtilization;
	
	private Double nonSlStaffUtilization;

	private Integer mealSequence;

	@Builder.Default
	private Boolean updated = false;

}
