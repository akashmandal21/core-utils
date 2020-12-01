/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResidenceOccupancyRequestDTO {
	
	private int residenceOccupancyId;
	private int occupancyId;
	private String occupancyName;
	private int startingPrice;
	private String pricingPlan;
	private int residenceId;
}
