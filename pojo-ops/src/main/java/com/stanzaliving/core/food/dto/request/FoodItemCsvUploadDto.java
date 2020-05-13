package com.stanzaliving.core.food.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemCsvUploadDto {

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Brand")
	private String defaultBrand;

	@JsonProperty("SpecialVeg")
	private Boolean specialVeg;

	@JsonProperty("Quantifiable")
	private Boolean quantifiable;

	@JsonProperty("TextColor")
	private String textColor;

	@JsonProperty("BgColor")
	private String bgColor;

	@JsonProperty("Tags")
	private String tags;

	@JsonProperty("Meals")
	private String meals;

}