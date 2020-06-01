package com.stanzaiving.core.attendance.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class MealDetailsDto {
	
	private Date startTime;

	private Date endTime;

	private String mealName;

}
