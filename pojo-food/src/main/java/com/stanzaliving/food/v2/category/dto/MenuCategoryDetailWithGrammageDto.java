package com.stanzaliving.food.v2.category.dto;


import java.util.List;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.food.v2.category.constant.CategoryStatus;
import com.stanzaliving.food.v2.grammage.category.response.CategoryGrammageBaseResponseDto;

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
public class MenuCategoryDetailWithGrammageDto extends MenuCategoryDTO {
	private String versionId;
	private MenuType menuType;
	private Double marginPercentage;
	private Double utilityCost;
	private List<MenuCategoryMealDto> mealData;
	private CategoryStatus categoryStatus;
	private FoodServeType foodServeType;
	private Integer maxWeeklyCombo;
	private boolean sampleMenuDefined;
	private boolean grammageDefined;
	private List<ListingDto> demographicTags;
	private boolean costUpdated;
	private int override;
	
	// derived information
	private int totalMealInWeek;
	private String mealWiseName;
	private String fullName;
	private List<MenuCategoryResidenceRDto> residences;
	private int noOfResidenceServed;

	private MealCategoryPriceDto mealPriceData;

	List<CategoryGrammageBaseResponseDto> grammageDto;
	

}
