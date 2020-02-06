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
public class UserFoodRatingDto {

	private String cityUuid;

	private String micromarketUuid;

	private String residenceUuid;

	private String userUuid;

	private double rating;

	private int numberOfFeedbacks;
}