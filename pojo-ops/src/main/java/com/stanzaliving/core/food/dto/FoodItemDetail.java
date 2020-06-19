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
	
	public String quantity;
	public String foodItemType;
	public String foodItemTypeName;
	public String replacementReasonDesc;
	public MealReplacementReason replacementReason;
	
}