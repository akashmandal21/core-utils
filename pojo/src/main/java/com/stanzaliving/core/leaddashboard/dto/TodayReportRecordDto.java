package com.stanzaliving.core.leaddashboard.dto;

import com.stanzaliving.core.leaddashboard.enums.GeographyViewEnum;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class TodayReportRecordDto {
	
	/*
	 * These two attributes are kept here for the 
	 * components already written in front-end;
	 */
	private GeographyViewEnum accessLevel;
	private int level;
	
	private String email;
	
	private String geography;
	private String source;
	private VisitReportDto visit;
	private ReportAttributeDto closure;
	private ReportAttributeDto dropped;
	
	private int totalFollowUps;
	private int totalFollowUpsPercentage;

	private int uniqueVisitCount;
}