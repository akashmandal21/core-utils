package com.stanzaliving.core.food.dto;


import com.stanzaliving.core.enums.UnitOfMeasurement;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemRecipeCostDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Double totalQuantity;
	private Double servingQuantity;
	private Double bufferPricePercentage;
	private UnitOfMeasurement uom;
	private PriceListingDto countryLevelPrice;
	private Map<String, PriceListingDto> kitchenWisePrice;
	private Map<String, PriceListingDto> cityLevelPrice;
}
