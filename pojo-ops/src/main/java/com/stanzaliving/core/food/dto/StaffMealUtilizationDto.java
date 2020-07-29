package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class StaffMealUtilizationDto {

	private String mealName;

	@Builder.Default
	private Double slStaffUtilization = 0d;

	@Builder.Default
	private Double nonSLStaffUtilization = 0d;
	
	private Integer sequence;

}
