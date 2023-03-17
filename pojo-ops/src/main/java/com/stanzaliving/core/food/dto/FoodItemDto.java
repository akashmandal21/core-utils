/**
 * 
 */
package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.CommercialTag;
import com.stanzaliving.core.food.enums.DishRegion;
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
 * @author naveen.kumar
 *
 * @date 21-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDto extends AbstractDto {

	private static final long serialVersionUID = -77949022653841785L;

	private String name;

	private FoodItemType itemType;

	private String itemTypeName;

	private String defaultBrandId;

	private String defaultBrandName;

	private boolean quantifiable;

	private String textColor;

	private String textColorName;

	private String bgColor;

	private String bgColorName;

	private String categoryId;

	private String categoryName;

	private List<TagDto> tagDtos;

	private int tagsCount;

	private List<EnumListing<MealType>> meals;

	private String subCategoryId;

	private String subCategoryName;

	private boolean vasEnabled;

	private Boolean isGrammagePresent;

	private Boolean menuTypeEligible;

	private boolean dataComplete;

	private boolean addOnEnabled;

	private RecipeType recipeType;

	private String recipeTypeName;

	private String description;

	private CommercialTag commercialTag;

	private String commercialTagName;

	private boolean eggPresent;

	private UnitOfMeasurement unitOfMeasurement;

	private String unitOfMeasurementName;

	private DishRecipeDetailsDto dishRecipeDetailsDto;

	private String imageUrl;

	private DishRegion dishRegion;

	private String dishRegionName;

	private Integer shelfLife;

	private boolean recipeExists;

	private boolean stapleDish;

	private Double estimatedCost;

	private List<TagDto> regionalTagDtos;

	private int regionalTagsCount;

	private List<TagDto> cuisineTagDtos;

	private int cuisineTagsCount;

	private List<ListingDto> feedback;

	private String linkedIngredientId;

	private boolean isValidDishDetails;

	private String foodItemCuisineTagId;
}