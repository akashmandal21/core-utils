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
public class PlaceResponseDTO {

	private int placeId;
	private String name;
	private int cityId;
	private String cityName;
	private double latitude;
	private double longitude;
	private boolean enabled;
	private String placeTypeName;
	private Integer placeTypeId;
	private Boolean isEditable;
}
