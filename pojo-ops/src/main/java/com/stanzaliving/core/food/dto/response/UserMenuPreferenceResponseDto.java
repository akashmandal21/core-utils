package com.stanzaliving.core.food.dto.response;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
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
public class UserMenuPreferenceResponseDto {

	private String userResidenceFoodMenuId;

	private MealType meal;

	private String mealName;

	private String mealImg;

	private boolean multiMenuPresent;

	private LocalDate date;

	private LocalTime startTime;

	private LocalTime endTime;

	private Date windowCloseTime;

	private boolean defaultChoice;
	
	private boolean mealSkippable;
	
	private boolean mealSkipped;

	private FoodPreferenceComboResponseDto selectedCombo;

	private List<FoodPreferenceComboResponseDto> preferenceComboResponseDtos;

}