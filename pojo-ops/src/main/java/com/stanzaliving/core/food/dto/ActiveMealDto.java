package com.stanzaliving.core.food.dto;

import java.time.LocalTime;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ActiveMealDto {

	private String meal;
	
	private MealType mealType;

	private LocalTime startTime;

	private LocalTime endTime;

	@Builder.Default
	private Boolean leftover = false;

	@Builder.Default
	private Boolean received = false;

	@Builder.Default
	private Boolean shortageSubmitted = false;

	@Builder.Default
	private Boolean feedbackGiven = false;
	
	private String vendorId;
	
	private String residenceFoodMenuId;

}