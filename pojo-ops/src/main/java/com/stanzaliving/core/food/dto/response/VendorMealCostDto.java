package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.VendorCostDto;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * 
 * @author naveen.kumar
 *
 * @date 14-May-2020
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VendorMealCostDto {

	private MealType mealType;

	private String mealTypeName;

	private boolean status;

	private VendorCostDto currentCost;

	private VendorCostDto budgetedCost;

	private VendorCostDto approvalPendingCost;

}