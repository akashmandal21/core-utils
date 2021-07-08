package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.dto.SortDto;
import com.stanzaliving.core.food.dto.OperatorValueDto;
import com.stanzaliving.core.food.enums.DishRegion;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 15-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemSearchRequestDto implements Serializable {

	private Set<String> itemIds;

	@NotNull(message = "MealType is mandatory for grammage selection")
	private MealType mealType;

	private DishRegion dishRegion;

	private String categoryId;

	private String subCategoryId;

	private String dishName;

	private MealType dishMealType;

	private String regionalTagId;

	private String cuisineTagId;

	private OperatorValueDto<Float> avgRating;

	private OperatorValueDto<Double> cost;

	/**
	 * foodRegion & basePreference are added for grammage of items
	 */
	private FoodRegion foodRegion;

	private FoodItemBasePreference basePreference;

	private SortDto sort;
}
