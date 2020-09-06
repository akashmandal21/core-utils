/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResidenceOccupancyResponseDTO {
	
	private int residenceOccupancyId;
	private int occupancyId;
	private String occupancyName;
	private int occupancyOccupancy;
	private int startingPrice;
	private boolean soldOut;
	private String residenceOccupancyImgUrl;
	private String pricingPlan;

}
