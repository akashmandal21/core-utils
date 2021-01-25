/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class LeadFunnelMetricsResponseDto {

	private int totalLeads;
	
	private int qualified;
	private int qualifiedLeadPercentage;
	
	private int visitsCompleted;
	private int visitsCompletedPercentage;
	
	private int booked;
	private int bookedPercentage;
	
	private int totalDropped;
	private int totalDroppedPercentage;
}
