/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
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
