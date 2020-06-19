/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.Date;
import java.util.List;

import com.stanzaliving.core.food.enums.MealRequestReplacementStatus;

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
public class MealReplacementResponseDto {

	private String userName;
	private String mealType;
	private Long timestamp;
	private String comment;
	private String mealReplacementUuid;
	private String rcActionStatus;
	private String rcActionStatusText;
	private Date createdAt;
	private MealRequestReplacementStatus mealRequestReplacementStatus;
	
	private List<FoodItemDetail> foodItemDetails;			
}
