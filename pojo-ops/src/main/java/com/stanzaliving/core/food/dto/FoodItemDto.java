/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;
import java.util.Set;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.CommercialTag;
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

	private Set<String> commercialTagsName;

	private boolean eggPresent;

	private UnitOfMeasurement unitOfMeasurement;

	private String unitOfMeasurementName;

}