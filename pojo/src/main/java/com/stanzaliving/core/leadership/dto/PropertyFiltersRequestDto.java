/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.leadership.enums.SortFilterEnum;
import com.stanzaliving.nucleusdashboard.enums.NucleusDashboardEnums;

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
	private LinkedHashMap<SortFilterEnum, String> sortByFilter;
	private Map<SortFilterEnum, String> sortingFields;
	
	private Map<EstateStatus, String> estateStatusDisplay;
	private Map<NucleusDashboardEnums, List<EstateStatus>> nucleusDashboardStatusMap;

	private List<CompetitionStatusFilter> competition;

	private LinkedHashMap<String, List<EstateStatus>> appQuickFilters;
}
