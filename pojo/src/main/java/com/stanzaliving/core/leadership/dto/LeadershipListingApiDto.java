/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.List;

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
public class LeadershipListingApiDto {

	private PropertyFiltersRequestDto propertyFiltersDto;
	
	private List<LeadershipPropertyAttributesDto> propertyListing;
}
