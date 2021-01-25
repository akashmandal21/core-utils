/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 05-May-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuBudgetValidateRequestDto {

	@NotBlank(message = "Menu group id is Mandatory")
	private String menuGroupId;

	@NotEmpty(message = "Meal Type Cost is mandatory")
	private Map<MealType, Double> mealTypeCost;

}