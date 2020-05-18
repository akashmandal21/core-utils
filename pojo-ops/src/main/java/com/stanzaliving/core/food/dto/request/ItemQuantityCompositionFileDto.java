package com.stanzaliving.core.food.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;

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
public class ItemQuantityCompositionFileDto {

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Brand")
	private ResidenceBrand brand;

	@JsonProperty("Region")
	private FoodRegion region;

	@JsonProperty("ServeType")
	private FoodServeType serveType;

	@JsonProperty("WeightInGram")
	private String weightInGram;

	@JsonProperty("Quantity")
	private String quantity;

}