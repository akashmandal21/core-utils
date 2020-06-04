package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuFeedbackDto {

	private Integer rating;

	private String mealName;

	private String menuDate;

	private Integer hostelId;

	private Integer mealFoodSatisfactionCount;

	private Integer weekFoodSatisfactionCount;

	private Integer mealFoodFeedbackCount;

	private Integer weekFoodFeedbackCount; // count for whole week

	private Integer tillDateFoodFeedbackCount; // count till current menu date

	private Integer tillDateFoodSatisfactionCount;

}
