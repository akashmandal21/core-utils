/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@ToString
public class AddressResponseDTO {

	private int addressId;
	private String line1;
	private String line2;
	private String landmark;
	private int zipCode;
	private int cityId;
	private String cityName;
	private double latitude;
	private double longitude;

}
