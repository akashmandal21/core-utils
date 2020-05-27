package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class DispatchListingDto {

	private String residenceName;
	
	private MealType mealType;
	
	private String mealTypeStr;
	
	private String mealDispatchTime;
	
	private String mealStartTime;
	
	private int vegMeals;
	
	private int nonVegMeals;
	
	private int staffMeals;
	
	private int vasVegMeals;
	
	private int vasNonVegMeals;
	
	private boolean printable;
	
	private String residenceMenuUuid;
	
	private String dispatchListUuid;
	
	
}
