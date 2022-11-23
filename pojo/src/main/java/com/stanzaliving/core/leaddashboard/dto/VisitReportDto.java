package com.stanzaliving.core.leaddashboard.dto;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class VisitReportDto {
	
	private int total;
	private int walkIns;
	private int scheduledAndCompleted;
	private int scheduledForToday;
	private int scheduleVisitsPercentage;
	private int earlyVisits;
	private int lateVisits;
	private int followUps;

}