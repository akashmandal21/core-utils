package com.stanzaliving.core.food.dto.response;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.RegionAndFoodItemBasePreference;

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
public class FoodPreferenceComboResponseDto implements Serializable {
	private String residenceFoodMenuId;
	private boolean defaultMenu;
	private boolean selected;
	private String comboName;
	private String mealCardName;
	private double mealCardRating;
	private String mealCuisineL1;
	private String mealCuisineL2;
	private List<String> mealImgUrls;
	private FoodItemBasePreference basePreference;
	private String basePreferenceName;
	private FoodRegion foodRegion;
	private String foodRegionName;
	private FoodItemType foodPreference;
	private String foodPreferenceName;
	private List<FoodPreferenceComboItemDto> comboItemDtos;
	private List<FoodPreferenceComboItemDto> beverageComboItemDtos;
	private String slogan;
	private String mealImg;
	private RegionAndFoodItemBasePreference regionAndFoodItemBasePreference;
	private String thaliId;
	private String thaliVariant;
	private String thaliName;
	private String mealGroupId;
	private String mealId;
	private String mealName;
	private Integer thaliSequence;

}
