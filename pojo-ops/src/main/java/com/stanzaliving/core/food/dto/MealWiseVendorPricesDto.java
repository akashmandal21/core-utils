/**
 * 
 */
package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 13-Jun-2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealWiseVendorPricesDto {

	private MealType mealType;

	private String mealName;

	private VendorCostDto currentCost;

	private VendorCostDto budgetedCost;

	private VendorCostDto approvalPendingCost;

}