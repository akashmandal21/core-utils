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
public class MealReplacementItemReasonDto {

	private String mealReplacementItemUuid;
	private MealReplacementReason mealReplacementReason;
}
