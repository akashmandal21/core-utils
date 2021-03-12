package com.stanzaliving.core.food.dto;


import com.stanzaliving.core.enums.UnitOfMeasurement;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemPriceDto {
	private Double totalCost;
	private Double totalQuantity;
	private Double perPaxCost;
	private Double perPaxQuantity;
	private UnitOfMeasurement uom;
	private Double bufferPricePercentage;
}
