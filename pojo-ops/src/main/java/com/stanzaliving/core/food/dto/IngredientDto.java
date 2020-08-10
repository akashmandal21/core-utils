/**
 * 
 */
package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.enums.IngredientType;
import com.stanzaliving.core.enums.UnitOfMeasurement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 10 Aug, 2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDto {

	private String ingredientId;

	private String ingredientName;

	private IngredientType ingredientType;

	private String ingredientTypeName;

	private UnitOfMeasurement unitOfMeasurement;

	private String unitOfMeasurementName;
}