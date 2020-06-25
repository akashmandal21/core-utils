/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@Getter
public class MealPlanResponseDTO {
	
	private int mealPlanId;
	private String name;
	private String iconImageUrl;
	private boolean enabled;

}
