package com.stanzaliving.wanda.response;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.website.response.dto.MealPlanResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FoodHomeScreenResponse {

	private String tomorrowMealTime;
	
	private String foodString;
	
	private String foodIcon;
	
	private String foodTitle;
	
	private String foodItems;
	
	private String mealType;
	
	private MealType mType;
	
	private boolean mealFlag;
	
	private boolean today;
	
	private boolean showTomorrowMeals;
}