/**
 * 
 */
package com.stanzaliving.core.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {

	@JsonProperty("addressLine1")
	private String addressLine1;

	@JsonProperty("addressLine2")
	private String addressLine2;

	@JsonProperty("landmark")
	private String landmark;

	@JsonProperty("cityName")
	private String cityName;

	@JsonProperty("stateName")
	private String stateName;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("countryName")
	private String countryName;

	@JsonProperty("cityUuid")
	private String cityUuid;

	@JsonProperty("micromarket")
	private String micromarketName;

	private String micromarketId;
	private String cityId;


}