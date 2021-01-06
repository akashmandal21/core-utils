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

	private EnumListing<FoodItemType> itemType;

	private boolean quantifiable;

	private EnumListing<FoodItemTextColor> textColor;

	private EnumListing<FoodItemBackgroundColor> bgColor;

	private ListingDto category;

	private ListingDto subCategory;

	private EnumListing<DishRegion> dishRegion;

	private EnumListing<RecipeType> recipeType;

	private EnumListing<CommercialTag> commercialTag;

	private EnumListing<UnitOfMeasurement> unitOfMeasurement;

	private boolean vasEnabled;

	private boolean addOnEnabled;

	private boolean eggPresent;

	private Integer shelfLife;

	private String imageUrl;

	private boolean dataComplete;

	private List<EnumListing<MealType>> meals;

	private List<TagDto> tagDtos;

	private int tagsCount;

	private Boolean isGrammagePresent;

	private Boolean menuTypeEligible;

	private DishMasterRecipeSearchIndexDto recipe;
}