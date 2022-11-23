/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import java.time.LocalDate;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class TodayReportGraphResponseDto {

	private LocalDate date;
	
	private int visits;
	private int closures;
	private int dropped;
	private int followUps;
}
