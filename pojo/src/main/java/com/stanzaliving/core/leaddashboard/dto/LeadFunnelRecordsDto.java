/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import java.util.List;

import com.stanzaliving.core.leaddashboard.enums.GeographyViewEnum;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class LeadFunnelRecordsDto {

	/*
	 * These two attributes are kept here for the 
	 * components already written in front-end;
	 */
	private GeographyViewEnum accessLevel;
	private int level;
	
	private String email;
	
	private String geography;
	private String source;
	
	private LeadFunnelTotalLeadsDto totalLeads;
	private LeadFunnelQualifiedDto qualified;
	private LeadFunnelVisitsCompleted visitsCompleted;
	
	private List<String> accessLevelCityName;	
	private List<String> accessLevelMicromarketName;
	private List<String> accessLevelResidenceName;
	
	private int booked;
	private int totalDropped;
}
