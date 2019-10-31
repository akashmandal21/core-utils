package com.stanzaliving.core.location;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class LocationTracer {

	@Autowired
	private GeoApiContext geoApiContext;

	public GeocodingResult getLocation(double latitude, double longitude) {

		LatLng latlng = new LatLng(latitude, longitude);

		final GeocodingResult[] results;

		try {

			results = GeocodingApi.newRequest(geoApiContext).latlng(latlng).await();

			if (results != null && results.length > 0) {
				return results[0];
			}
		} catch (ApiException | InterruptedException | IOException e) {
			log.error("Got Exception while getting lat long details");
			e.printStackTrace();
		}

		return null;
	}

}
