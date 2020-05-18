package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

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
public class ResidentFoodFeedbackDto {

	private String residentFoodFeedbackId;

	private String foodOrderId;

	private String residenceFoodMenuId;

	private LocalDate menuDate;

	private MealType mealType;

	private String userId;

	private String vendorId;

	private Float rating;

	private String reason;

	private String comment;

	private List<ResidentFoodItemFeedbackDto> foodItemFeedbackDtos;

}