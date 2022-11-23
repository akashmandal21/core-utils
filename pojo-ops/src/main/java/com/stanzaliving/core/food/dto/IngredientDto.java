/**
 * 
 */
package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.enums.IngredientType;
import com.stanzaliving.core.enums.UnitOfMeasurement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @author naveen.kumar
 *
 * @date 10 Aug, 2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDto implements Serializable {

	private String ingredientId;
	private String ingredientName;
	private IngredientType ingredientType;
	private String ingredientTypeName;
	private UnitOfMeasurement unitOfMeasurement;
	private String unitOfMeasurementName;
	private Double countryWisePrice; 
	private List<PriceListingDto> cityWisePrice; 
	private List<PriceListingDto> kitchenWisePrice;
	private boolean priceMissing;
}