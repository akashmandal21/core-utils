/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import lombok.*;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CityFilter {

	private String cityName;
	private String cityUuid;
	private long cityId;

	public CityFilter(String cityName, String cityUuid) {
		this.cityName = cityName;
		this.cityUuid = cityUuid;
	}
}
