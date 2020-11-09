package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.LocationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookMetaDto implements Serializable {
	
	private LocationType locationType;
	
	private String locationName;

	private String uuid;

	private String cityUuid;

	private String cityName;

	private String stateUuid;

	private String stateName;

	private String  countryUuid;

	private String  countryName;

	private String microMarketUuid;

	private String microMarketName;

	private String pincode;

	private String addressLine1;
	
	private String addressLine2;
	
	private String landmark;
	
	private Double latitude;

	private Double longitude;


}
