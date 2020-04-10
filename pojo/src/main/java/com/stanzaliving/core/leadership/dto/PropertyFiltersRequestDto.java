/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.leadership.enums.SortFilterEnum;

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
public class PropertyFiltersRequestDto {

	private List<PropertyStatusFilter> propertyStatusFilter;
	private BedAttributesFilter bedAttributesFilter;
	private PropertyLocationFilter propertyLocationFilter;
	private DateRangeFilter dateRangeFilter;
	private BrandFilter brandFilter;
	private UserFilter userFilter;
	private Map<SortFilterEnum, String> sortByFilter;
	private Map<SortFilterEnum, String> sortingFields;
}
