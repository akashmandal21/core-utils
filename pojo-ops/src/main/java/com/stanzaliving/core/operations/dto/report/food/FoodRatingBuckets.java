/**
 * 
 */
package com.stanzaliving.core.operations.dto.report.food;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 04-Feb-2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodRatingBuckets {

	private int totalFeedbacks;
	
	private int totalResidents;

	private int delightedResidents;

	private int satisfiedResidents;

	private int dissatisfiedResidents;

	private int disgustedResidents;
}