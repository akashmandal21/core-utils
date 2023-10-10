package com.stanzaliving.website.response.dto;

import java.io.Serializable;

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
public class ResidenceNearbyLocationResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int residenceNearbyLocationId;
	private int nearbyLocationId;
	private String nearbyLocationName;
	private double distance;
	@Builder.Default
	private int locationOrder = 0;
	private int cityId;
}
