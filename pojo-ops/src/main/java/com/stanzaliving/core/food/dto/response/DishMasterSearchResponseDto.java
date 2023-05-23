package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.dto.KeyValuePairDto;
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

import java.io.Serializable;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com'
 *
 * @version 1.0
 *
 * @since 15-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DishMasterSearchResponseDto implements Serializable {

	private static final long serialVersionUID = -77949022785L;

	private String dishId;

	private String name;

	private EnumListing<FoodItemType> itemType;

	private Boolean quantifiable;

	private EnumListing<String> textColor;

	private KeyValuePairDto bgColor;

	private ListingDto category;

	private ListingDto subCategory;

	private Boolean dataComplete;

	private Boolean addOnEnabled;

	private boolean isBeverage;

	private EnumListing<RecipeType> recipeType;

	private EnumListing<CommercialTag> commercialTag;

	private Boolean eggPresent;

	private EnumListing<UnitOfMeasurement> unitOfMeasurement;

	private EnumListing<DishRegion> dishRegion;

	private List<EnumListing<MealType>> meals;

	private List<TagsDto> tags;

	private List<TagsDto> regionalTags;

	private List<TagsDto> cuisineTags;

	private Integer shelfLife;

	private boolean recipeExists;

	private boolean stapleDish;
}
