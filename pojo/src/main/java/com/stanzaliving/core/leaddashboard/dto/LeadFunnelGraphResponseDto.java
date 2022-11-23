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
public class LeadFunnelGraphResponseDto {

	private int totalLeads;
	private int qualified;
	private int completed;
	private int booked;
	private int dropped;
}
