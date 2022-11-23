package com.stanzaliving.website.request.dto;

import java.util.HashSet;
import java.util.Set;

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
public class ResidenceLocation {
	private int residenceId;
	@Builder.Default
	private Set<ResidenceNearbyLocationRequestDTO> residenceNearbyLocations = new HashSet<>(0);
}
