package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
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
public class ResidenceFoodMenuFeedbackDto {

	private String residenceId;

	private LocalDate menuDate;

	private MealType mealType;
	
	private Integer sequence;

	private Float menuRating;

	private ResidentFoodFeedbackDto residentfeedbackDto;
}
