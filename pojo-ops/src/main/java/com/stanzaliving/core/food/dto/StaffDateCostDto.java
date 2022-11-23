package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StaffDateCostDto {
	
	private LocalDate date;
	
	@Builder.Default
	private Double slStaffCost = 0d;
	
	@Builder.Default
	private Double nonSLStaffCost = 0d;

}
