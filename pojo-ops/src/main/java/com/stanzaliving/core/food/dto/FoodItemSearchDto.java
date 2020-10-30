package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.core.food.enums.FoodItemBackgroundColor;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.RecipeType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Collection;
import java.util.List;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 03-May-2020
 *
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemSearchDto extends AbstractDto {

	private Collection<String> itemIds;

	private String name;

	private FoodItemType itemType;

	private String defaultBrand;

	private boolean quantifiable;

	private String textColor;

	private FoodItemBackgroundColor bgColor;

	private String category;
	
	private MealType mealType;

	private PageAndSortDto pageDto;
	
	private String subCategory;

	private RecipeType recipeType;

	private Collection<RecipeType> recipeTypeList;
	
	private Boolean dataComplete;
}