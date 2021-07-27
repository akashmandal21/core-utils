package com.stanzaliving.core.food.dto;

import java.util.Collection;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.dto.PageAndSortDto;
import com.stanzaliving.core.food.enums.DishRegion;
import com.stanzaliving.core.food.enums.FoodItemBackgroundColor;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.RecipeType;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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

	private static final long serialVersionUID = -1699086756827155062L;

	private Collection<String> itemIds;

	private String name;

	private FoodItemType itemType;

	private FoodItemBackgroundColor bgColor;

	private String category;

	private String tagId;

	private String regionalTagId;

	private String cuisineTagId;

	private MealType mealType;

	private PageAndSortDto pageDto;

	private String subCategory;

	private RecipeType recipeType;

	private Collection<RecipeType> recipeTypeList;

	private Boolean dataComplete;

	private Boolean recipeExists;

	private DishRegion dishRegion;
	
	private Boolean vegExclusive;
}