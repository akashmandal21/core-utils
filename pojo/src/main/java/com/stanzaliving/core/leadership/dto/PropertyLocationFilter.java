/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.List;

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

	private List<CityFilter> cityFilter;
	private List<MicromarketFilter> micromarketFilter;
}
