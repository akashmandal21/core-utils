package com.stanzaliving.core.base.location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
public class GeoPointDto {

	private Double lat;
	private Double lon;
	private Long distance;

	public GeoPointDto(Double lat, Double lon) {
		this.lat = lat;
		this.lon = lon;
	}

}