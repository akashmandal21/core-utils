package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

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

	private String date;

	private MealType mealType;

	private String mealName;

	private String userId;

	private String vendorId;

	private Float rating;

	private String reason;

	private String comment;

	private LocalTime startTime;

	private LocalTime endTime;

	private String imageUrl;

	private String notificationId;

	private List<ResidentFoodItemFeedbackDto> foodItemFeedbackDtos;

	private Map<Integer, List<ResidentMealFeedbackOptions>> ratingWiseMealFeedbackOptions;

	private boolean partial;
}