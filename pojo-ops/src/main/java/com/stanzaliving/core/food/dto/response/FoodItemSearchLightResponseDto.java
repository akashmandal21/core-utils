package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.dto.GstDto;
import com.stanzaliving.core.food.dto.RecipeIngredientDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.RecipeType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 25-Sep-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemSearchLightResponseDto {
	private String dishId;

	private String name;

	private EnumListing<FoodItemType> itemType;

	private EnumListing<UnitOfMeasurement> unit;

	private Boolean quantifiable;

	private EnumListing<RecipeType> recipeType;

	private List<RecipeIngredientDto> ingredients;

	private Integer gstPercentage;

	private boolean recipeExists;
}
