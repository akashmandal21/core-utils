package com.stanzaliving.core.leaddashboard.dto;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class ReportAttributeDto {
	
	private int total;
	private int totalPercentage;
	
	private int walkIns;
	private int walkInsPercentage;
	
	private int schedule;
	private int schedulePercentage;
	
	private int followUps;
	private int followUpsPercentage;
}