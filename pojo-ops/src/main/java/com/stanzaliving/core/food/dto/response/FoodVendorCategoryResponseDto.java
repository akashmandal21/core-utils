package com.stanzaliving.core.food.dto.response;

import java.util.List;

import com.stanzaliving.core.food.dto.VendorCostDto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stazaliving.com"
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
public class FoodVendorCategoryResponseDto {

	private String categoryId;

	private String categoryName;

	private boolean status;

	private boolean pricing;

	private boolean pricesPendingForApproval;
	
	private boolean editingAllowed;
	
	private boolean stanzaKitchen;
	
	private long residenceCount;

	private List<VendorMealCostDto> mealCostDtos;

	private VendorCostDto totalCurrentCost;

	private VendorCostDto totalBudgetedCost;

	private VendorCostDto totalApprovalPendingCost;
}