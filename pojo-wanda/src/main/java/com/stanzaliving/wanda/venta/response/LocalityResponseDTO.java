/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.venta.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "cityId", "cityName", "enabled", "latitude", "longitude" })
public class LocalityResponseDTO {

	private Integer micromarketId;
	private String name;
	private Integer cityId;
	private String cityName;
	private double latitude;
	private double longitude;
	private boolean enabled;

}
