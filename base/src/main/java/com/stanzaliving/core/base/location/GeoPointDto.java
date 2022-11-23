package com.stanzaliving.core.base.location;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@Builder
@Log4j2
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GeoPointDto implements Serializable {

	private static final long serialVersionUID = 8875327824763009594L;

	private Double lat;
	private Double lon;
	private Long distance;

	public GeoPointDto(Double lat, Double lon) {
		this.lat = lat;
		this.lon = lon;
	}

	public static GeoPointDto valueOf(String latlong, String delimiter) {

		GeoPointDto geoPointDto = new GeoPointDto();

		try {

			String[] latlongArray = latlong.split(delimiter);
			geoPointDto.setLat(Double.valueOf(latlongArray[0]));
			geoPointDto.setLon(Double.valueOf(latlongArray[1]));
		} catch (Exception e) {
			log.error("Error while creating object for [" + latlong + "]");
			return null;
		}
		return geoPointDto;
	}

	public static List<GeoPointDto> valueOf(String polygonPoints, String firstDelimiter, String secondDelimiter) {

		String[] latlongs = polygonPoints.split(firstDelimiter);

		List<GeoPointDto> pointDtos = new ArrayList<>();

		for (int i = 0; i < latlongs.length; i++) {

			GeoPointDto dto = valueOf(latlongs[i], secondDelimiter);
			if (Objects.nonNull(dto)) {
				pointDtos.add(dto);
			}
		}

		return pointDtos;
	}
}