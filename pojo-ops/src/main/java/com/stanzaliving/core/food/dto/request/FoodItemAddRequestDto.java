/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.CommercialTag;
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
 * @author naveen.kumar
 *
 * @date 21-Apr-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemAddRequestDto {

	@NotBlank(message = "Dish Name is Mandatory")
	private String name;

	@NotNull(message = "Recipe Type is Mandatory")
	private RecipeType recipeType;

	private String description;

	@NotBlank(message = "Dish Category is Mandatory")
	private String category;

	@NotBlank(message = "Dish Sub Category is Mandatory")
	private String subCategory;

	@NotNull(message = "Meals selection is mandatory")
	private List<MealType> meals;

	private boolean addOnEnabled;

	@NotBlank(message = "Dish Color is Mandatory")
	private String bgColor;

	@NotBlank(message = "Dish Text Color is Mandatory")
	private String textColor;

	@NotNull(message = "Dish Type is Mandatory")
	private FoodItemType itemType;

	@NotNull(message = "Dish Quantifiable flag is mandatory")
	private Boolean quantifiable;

	private String defaultBrand;

	@NotNull(message = "Primary Tags are mandatory")
	private Set<String> primaryTagIds;

	private Set<CommercialTag> commercialTags;

	private boolean eggPresent;

	@NotNull(message = "Unit of Measurement is mandatory")
	private UnitOfMeasurement unitOfMeasurement;
}