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
public class ResidenceNearbyLocationResponseDTO {

	private int residenceNearbyLocationId;
	private int nearbyLocationId;
	private String nearbyLocationName;
	private double distance;
	@Builder.Default
	private int locationOrder = 0;

}
