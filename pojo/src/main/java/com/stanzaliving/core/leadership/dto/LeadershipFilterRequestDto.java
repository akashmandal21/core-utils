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
public class LeadershipFilterRequestDto {

	private List<String> estateStatuses;
	private BedCountRange bedCountRange;
	private RentBedRange rentBedRange;
	private String city;
	private String micromarket;
	private CreatedBetweenDateRange createdBetween;
	private L1ApprovedLeadershipBetween l1ApprovedBetween;
	private PropertyNamingDoneBetween propertyNamingBetween;
	private String slBrand;
	private String slSubBrand;
	private String bdExecutive;
	private String regionalManager;
	
	private int pageNumber;
	private int pageSize;
}
