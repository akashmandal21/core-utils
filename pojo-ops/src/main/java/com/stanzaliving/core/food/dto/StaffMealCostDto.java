package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffMealCostDto {

	@Builder.Default
	private Double slStaffCost = 0d;

	@Builder.Default
	private Double nonSLStaffCost = 0d;

}