/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressRequestDTO {

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
	private String displayAddressLine1;
	private String displayAddressLine2;
}
