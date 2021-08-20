package com.stanzaliving.website.response.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaSyncDataResponseDTO {

	private String residenceName;
	private Integer gender;
	private boolean enabled;
	private String occupancyPricing;
	private String ancillaryServiceName;
	private String attributeName;
	private String consumableName;
	private String preBookingAmount;
	private Integer residenceTypeId;
	private String propertyCode;
}
