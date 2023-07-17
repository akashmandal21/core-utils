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

import java.io.Serializable;

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
public class ResidentMealFeedbackOptions implements Serializable {

	private String mealFeedbackOptionUuid;
	
	private String mealFeedbackOptionName;
	
	private boolean dishFeedbackRequired;
	
	private boolean selected;
}