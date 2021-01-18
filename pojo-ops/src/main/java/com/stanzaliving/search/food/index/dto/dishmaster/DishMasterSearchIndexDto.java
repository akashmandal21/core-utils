package com.stanzaliving.search.food.index.dto.dishmaster;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.dto.TagDto;
import com.stanzaliving.core.food.enums.CommercialTag;
import com.stanzaliving.core.food.enums.DishRegion;
import com.stanzaliving.core.food.enums.FoodItemBackgroundColor;
import com.stanzaliving.core.food.enums.FoodItemTextColor;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.RecipeType;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 05-Jan-2021
 *
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DishMasterSearchIndexDto extends AbstractDto {

	private String name;

	private String description;

	private FoodItemType itemType;

	private Boolean quantifiable;

	private FoodItemTextColor textColor;

	private FoodItemBackgroundColor bgColor;

	private String categoryId;

	private String subCategoryId;

	private DishRegion dishRegion;

	private RecipeType recipeType;

	private CommercialTag commercialTag;

	private UnitOfMeasurement unitOfMeasurement;

	private Boolean vasEnabled;

	private Boolean addOnEnabled;

	private Boolean eggPresent;

	private Integer shelfLife;

	private String imageUrl;

	private boolean dataComplete;

	private List<MealType> meals;

	private List<String> tagIds;

	private DishMasterRecipeSearchIndexDto recipe;

	private boolean recipeExists;

}