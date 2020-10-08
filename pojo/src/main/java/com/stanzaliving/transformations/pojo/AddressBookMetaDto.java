package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.LocationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookMetaDto {
	
	private LocationType locationType;
	
	private String locationName;

	private String uuid;

	private String cityUuid;

	private String stateUuid;

	private String  countryUuid;

	private String microMarketUuid;
	
	private String pincode;

	private String addressLine1;
	
	private String addressLine2;
	
	private String landmark;
	
	private double latitude;

	private double longitude;


}
