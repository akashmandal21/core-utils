/**
 * 
 */
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
public class MealRequestReplacementDto {

	private String userId;
	private String userName;
	
	private int quantity;
	private String mealType;
	private String foodItemType;
	private String qrContexType;
	
	private String mealDate;
	private String qrUuid;
	private String residenceFoodMenuId;
	private MealReplacementReason replacementReason;
		
}
