package com.stanzaliving.core.food.dto.response;

import java.util.List;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodRegion;

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
public class FoodPreferenceComboResponseDto {

	private String residenceFoodMenuId;

	private boolean defaultMenu;

	private boolean selected;

	private String comboName;

	private FoodItemBasePreference basePreference;

	private String basePreferenceName;

	private FoodRegion foodRegion;

	private String foodRegionName;

	private FoodItemType foodPreference;

	private String foodPreferenceName;

	private List<FoodPreferenceComboItemDto> comboItemDtos;
	
	private String slogan;

	private String mealImg;

}