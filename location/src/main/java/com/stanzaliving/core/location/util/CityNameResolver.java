package com.stanzaliving.core.location.util;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.google.maps.model.AddressComponent;
import com.google.maps.model.AddressComponentType;
import com.google.maps.model.GeocodingResult;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CityNameResolver {

	public String getCityName(GeocodingResult geocodingResult) {
		
		if(Objects.isNull(geocodingResult)) {
			return null;
		}
		
		AddressComponent [] addressComponents = geocodingResult.addressComponents;
		
		for (AddressComponent addressComponent : addressComponents) {
			
			List<AddressComponentType> types = Arrays.asList(addressComponent.types);
			
			if(types.contains(AddressComponentType.LOCALITY) && types.contains(AddressComponentType.POLITICAL)) {
				return addressComponent.longName;
			}
		}
		return null;
	}
}
