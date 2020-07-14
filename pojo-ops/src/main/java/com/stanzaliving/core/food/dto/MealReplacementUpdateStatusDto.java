/**
 * 
 */
package com.stanzaliving.core.food.dto;

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
public class MealReplacementUpdateStatusDto {

	private String comment;
	private String mealReplacementUuid;
	private MealRequestReplacementStatus mealReplacementStatus;
	
	List<MealReplacementItemReasonDto> mealReplacementItemReason;
}
