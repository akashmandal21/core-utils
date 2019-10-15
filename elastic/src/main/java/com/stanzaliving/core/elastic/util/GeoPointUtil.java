package com.stanzaliving.core.elastic.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import com.stanzaliving.core.base.location.GeoPointDto;

public class GeoPointUtil {

	private GeoPointUtil() {
	}

	public static GeoPoint getElasticPoint(GeoPointDto point) {
		return new GeoPoint(point.getLat(), point.getLon());
	}

	public static GeoPointDto getDtoPoint(GeoPoint point) {
		return new GeoPointDto(point.getLat(), point.getLon());
	}

	public static List<GeoPoint> getElasticPoints(List<GeoPointDto> points) {
		List<GeoPoint> geopoints = null;

		if (points != null) {
			geopoints = points.stream().map(GeoPointUtil::getElasticPoint).collect(Collectors.toList());
		}

		return geopoints;
	}

	public static List<GeoPointDto> getDtoPoints(List<GeoPoint> points) {
		List<GeoPointDto> geopoints = null;

		if (points != null) {
			geopoints = points.stream().map(GeoPointUtil::getDtoPoint).collect(Collectors.toList());
		}

		return geopoints;
	}

}