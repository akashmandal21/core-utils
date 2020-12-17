package com.stanzaliving.website.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResidenceNearbyLocationRequestDTO {

	private int residenceNearbyLocationId;
	private int nearbyLocationId;
	private String nearbyLocationName;
	private double distance;
	@Builder.Default
	private int locationOrder = 0;
	private boolean enabled;
	private int cityId;

}
