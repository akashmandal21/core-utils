/**
 * 
 */
package com.stanzaliving.core.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen
 *
 * @date 09-Oct-2019
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

	private String addressLine1;

	private String addressLine2;

	private String landmark;

	private String cityName;

	private String stateName;

	private String postalCode;

	private String countryName;
	
	private String cityUuid;

}