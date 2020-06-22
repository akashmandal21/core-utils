package com.stanzaliving.core.food.dto;


import com.stanzaliving.core.food.enums.MealReplacementReason;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class FoodItemDetail {
	
	private String quantity;
	private String foodItemType;
	private String foodItemTypeName;
	private String itemQuantity;
	
	private String mealReplacementItemUuid;
	private MealReplacementReason replacementReason;
	private String replacementReasonDesc;
}