/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.enums.UnitOfMeasurement;
import com.stanzaliving.core.food.enums.CommercialTag;
import com.stanzaliving.core.food.enums.DishRegion;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.RecipeType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

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

	private List<MealType> meals;

	private Boolean addOnEnabled;

	private String bgColor;

	private String textColor;

	private FoodItemType itemType;

	private Boolean quantifiable;

	private String defaultBrand;

	private Set<String> primaryTagIds;

	private Set<String> cuisineTagIds;

	private Set<String> regionalTagIds;

	private CommercialTag commercialTag;

	private Boolean eggPresent;

	private DishRegion dishRegion;

	private Integer shelfLife;

	@NotNull(message = "Unit of Measurement is mandatory")
	private UnitOfMeasurement unitOfMeasurement;

	private String imageId;

	private boolean stapleDish;

	private boolean status;

	@Valid
	@NotNull(message = "Recipe selection is mandatory")
	private ItemRecipeRequestDto recipe;

	private Set<String> feedback;

	private String linkedIngredientId;

	private String foodItemCuisineTagId;

}