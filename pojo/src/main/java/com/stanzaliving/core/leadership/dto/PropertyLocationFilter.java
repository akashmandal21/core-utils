/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import com.stanzaliving.transformations.ui.pojo.City;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PropertyLocationFilter {

	private CityFilter cityFilter;
}
