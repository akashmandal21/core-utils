package com.stanzaliving.core.food.dto.request;

import com.opencsv.bean.CsvBindByName;
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

	@CsvBindByName(column = "Dish_Name")
	private String name;

	@CsvBindByName(column = "Status")
	private String status;

	@CsvBindByName(column = "Recipe_Type")
	private String recipeType;

	@CsvBindByName(column = "Description")
	private String description;

	@CsvBindByName(column = "Brand")
	private String defaultBrand;
	
	@CsvBindByName(column = "Category")
	private String category;

	private String categoryId;

	@CsvBindByName(column = "Sub_Category")
	private String subCategory;

	private String subCategoryId;

	@CsvBindByName(column = "Meals")
	private String meals;

	@CsvBindByName(column = "Add_On")
	private String addOnEnabled;

	@CsvBindByName(column = "Dish_Color")
	private String bgColor;

	@CsvBindByName(column = "TextColor")
	private String textColor;

	@CsvBindByName(column = "Dish_Type")
	private String itemType;

	@CsvBindByName(column = "Special_Veg")
	private String specialVeg;

	@CsvBindByName(column = "Quantifiable")
	private String quantifiable;

	@CsvBindByName(column = "UOM")
	private String unitOfMeasurement;

	@CsvBindByName(column = "Cook Quantity")
	private String cookQuantity;

	@CsvBindByName(column = "Grammage_per_pax")
	private Double grammagePerPax;

	@CsvBindByName(column = "Ingredient")
	private String ingredient;

	@CsvBindByName(column = "Ingredient UOM")
	private String ingredientUOM;

	@CsvBindByName(column = "Ingredient_Quantity")
	private Double ingredientQty;

	@CsvBindByName(column = "Commercial_tag")
	private String commercialTag;

	@CsvBindByName(column = "Primary_tags")
	private String primaryTags;

}