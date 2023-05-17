package com.stanzaliving.website.response.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressResponseDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int addressId;
	private Long propertyLocationId;
	private String line1;
	private String line2;
	private String landmark;
	private int zipCode;
	private int cityId;
	private String cityName;
	private double latitude;
	private double longitude;
	private String phone;
	private String mobile;
	private String displayAddressLine1;
	private String displayAddressLine2;
	private String displayAddress;
}
