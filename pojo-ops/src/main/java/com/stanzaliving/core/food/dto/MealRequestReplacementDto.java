/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

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
	private String mealType;
	private String qrContexType;
	private String mealDate;
	private String residenceFoodMenuId;
	private String qrUuid;
	
	private List<FoodItemDetail> foodItemDetails;		
}
