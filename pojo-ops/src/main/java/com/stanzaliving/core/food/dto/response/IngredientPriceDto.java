package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

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
	
	private double stockQuantity;
	private double stockValue;
	private double conversionFactor;
	
	private boolean priceMissing;
	private LocalDate priceDate;
}
