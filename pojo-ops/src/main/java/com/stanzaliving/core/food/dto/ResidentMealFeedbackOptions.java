/**
 * 
 */
package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 30-Mar-2021
 *
**/
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResidentMealFeedbackOptions {

	private String mealFeedbackOptionUuid;
	
	private String mealFeedbackOptionName;
	
	private boolean dishFeedbackRequired;
	
	private boolean selected;
}