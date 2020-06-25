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
public class ResidenceNearbyLocationResponseDTO {

	private int residenceNearbyLocationId;
	private int nearbyLocationId;
	private String nearbyLocationName;
	private double distance;
	@Builder.Default
	private int locationOrder = 0;

}
