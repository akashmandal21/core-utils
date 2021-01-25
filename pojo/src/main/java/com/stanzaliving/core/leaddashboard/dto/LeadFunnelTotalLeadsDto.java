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
public class LeadFunnelTotalLeadsDto {

	private int totalLeads;
	
	private int disqualified;
	private int disqualifiedPercentage;
	
	private int yetToQualify;
	private int yetToQualifyPercentage;
}
