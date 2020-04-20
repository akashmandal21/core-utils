/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PropertyLocationFilter {

	private Set<CityFilter> cityFilter;
	private Set<MicromarketFilter> micromarketFilter;
}
