package com.stanzaliving.core.food.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.food.enums.FoodItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemCsvUploadDto {

	@JsonProperty("Dish_Name")
	private String name;

	@JsonProperty("Status")
	private String status;

	@JsonProperty("Recipe_Type")
	private String recipeType;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("Brand")
	private String defaultBrand;
	
	@JsonProperty("Category")
	private String category;

	@JsonProperty("Sub_Category")
	private String subCategory;

	@JsonProperty("Meals")
	private String meals;

	@JsonProperty("Add_On")
	private String addOnEnabled;

	@JsonProperty("Dish_Color")
	private String bgColor;

	@JsonProperty("TextColor")
	private String textColor;

	@JsonProperty("Dish_Type")
	private FoodItemType itemType;

	@JsonProperty("Special_Veg")
	private String specialVeg;

	@JsonProperty("Quantifiable")
	private Boolean quantifiable;

	@JsonProperty("UOM")
	private String unitOfMeasurement;

	@JsonProperty("Cook Quantity")
	private String cookQuantity;

	@JsonProperty("Grammage_per_pax")
	private Double grammagePerPax;

	@JsonProperty("Ingredient")
	private String ingredient;

	@JsonProperty("Ingredient UOM")
	private String ingredientUOM;

	@JsonProperty("Ingredient_Quantity")
	private Double ingredientQty;

	@JsonProperty("Commercial_tag")
	private String commercialTag;

	@JsonProperty("Primary_tags")
	private String primaryTags;

}