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
public class LeadFunnelQualifiedDto {

	private int qualified;
	private int qualifiedPercentage;
	
	private int preVisitDrop;
	private int preVisitDropPercentage;
	
	private int followUp;
	private int followUpPercentage;
	
	private int visitsScheduled;
	private int visitsScheduledPercentage;
}
