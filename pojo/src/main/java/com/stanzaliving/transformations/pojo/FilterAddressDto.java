package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.LocationType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FilterAddressDto {

	private LocationType locationType;

	private String locationUUID;
	
	private String locationName;
	
	private String cityUUID;
	
	private String stateUUID;
	
	private String countryUUID;
	
	private String micromarketUUID;
	
	private String pincode;
	
	private Double latitude;

	private Double longitude;
	
}
