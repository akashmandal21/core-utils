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
public class LeadFunnelVisitsCompleted {

	private int visitsCompleted;
	private int visitsCompletedPercentage;
	
	private int followUp;
	private int followUpPercentage;
	
	private int postVisitDrop;
	private int postVisitDropPercentage;
}
