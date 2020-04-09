/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DateRangeFilter {

	private CreatedBetweenDateRange createdDateRange;
	private L1ApprovedLeadershipBetween l1ApprovedBetween;
	private PropertyNamingDoneBetween propertyNamingBetween;
}
