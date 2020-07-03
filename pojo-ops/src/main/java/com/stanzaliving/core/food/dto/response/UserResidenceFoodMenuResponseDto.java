package com.stanzaliving.core.food.dto.response;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodRegion;
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
public class UserResidenceFoodMenuResponseDto {
	
	private String userResidenceFoodMenuId;
	
	private String residenceFoodMenuId;
	
	private MealType meal;
	
	private String mealName;
	
	private LocalDate date;
	
	private LocalTime startTime;
	
	private LocalTime endTime;
	
	private FoodItemBasePreference basePreference;
	
	private String basePreferenceName;
	
	private FoodRegion foodRegion;
	
	private String foodRegionName;
	
	private FoodItemType foodItemType;
	
	private String foodItemTypeName;
	
	private boolean defaultChoice;
	
	private List<FoodPrefernceComboResponseDto> preferenceComboResponseDtos;
	
	private List<FoodPreferenceComboItemDto> selectedComboItems;
	

}
