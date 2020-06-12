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

	private String mealDate;
	private String qrUuid;
	private String userId;
	private String userName;
	private MealReplacementReason replacementReason;
	
}
