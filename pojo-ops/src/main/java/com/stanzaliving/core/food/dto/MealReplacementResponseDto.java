/**
 * 
 */
package com.stanzaliving.core.food.dto;

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
	private String foodType;
	private int quantity;
	private Long timestamp;
	private String comment;
	private String mealReplacementUuid;
	private String replacementReason;
	private String rcActionStatus;
	private String rcActionStatusText;
		
}
