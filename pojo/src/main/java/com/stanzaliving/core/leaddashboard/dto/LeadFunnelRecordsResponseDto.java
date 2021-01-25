/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import java.util.List;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class LeadFunnelRecordsResponseDto {

	private boolean replaceData;
	/*
	 * This accessLevel attributes is used to identify, the immediate parent
	 * node for appending the data.
	 */
	private String accessLevelCityName;	
	private String accessLevelMicromarketName;
	private String accessLevelResidenceName;
	private int accessLevel;
	
	private List<LeadFunnelRecordsDto> records;
	private LeadFunnelRecordsDto total;
}
