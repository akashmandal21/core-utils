package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.LocationType;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class FilterAddressDto {

	private String addressUuid;

	private List<LocationType> locationTypes;

	private String locationUUID;

	private List<String> locations;

	private String locationName;
	
	private String cityUUID;
	
	private String stateUUID;
	
	private String countryUUID;
	
	private String micromarketUUID;
	
	private String pincode;
	
	private Double latitude;

	private Double longitude;
	
}
