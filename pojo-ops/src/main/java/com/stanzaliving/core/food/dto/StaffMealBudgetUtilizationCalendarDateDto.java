package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.food.enums.FoodDayType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString(callSuper = true)
public class StaffMealBudgetUtilizationCalendarDateDto {
	
	private LocalDate date;

	private FoodDayType dayType;

	private boolean holiday;
	
	private boolean nonVegDay; 

	private Integer slStaffCount;
	
	private Integer nonSLStaffCount;

	private Double slStaffCost;
	
	private Double nonSLStaffCost;

	private List<StaffMealAttendanceUtilizationDto> mealAttendanceUtilizationDtoList;

}
