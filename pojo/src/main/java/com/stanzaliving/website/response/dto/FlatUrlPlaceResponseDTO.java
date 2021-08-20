package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FlatUrlPlaceResponseDTO {

	private String name;
	private int placeId;
	private boolean enabled;
	private Boolean isPlaceEnabled;
}