package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientPriceDto {
	private String ingredientId;
	private String cityId;
	private String vendorId;
	private String countryId;

	private double price;
	private double gst;
	private double totalPrice;

	private boolean priceMissing;
	
}
