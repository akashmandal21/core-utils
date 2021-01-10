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
public class MealAndContainterCountDto {

	private int receivedContainerCount;
	private int actualContainerCount;
	
	private int receivedMealCount;
	private int actualMealCount;
	
	private int vasMealReceivedCount;
	private int vasActualCount;
}
