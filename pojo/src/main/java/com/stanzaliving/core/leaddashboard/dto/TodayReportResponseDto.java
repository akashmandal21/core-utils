
/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import java.util.List;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class TodayReportResponseDto {

	private int noOfVisits;
	private int noOfClosures;
	private int noOfDropped;
	private int noOfFollowUps;
	private int droppedPercentage;
	private int followUpPercentage;
	private int uniqueVisitCount;
	
	private boolean replaceData;
	
	/*
	 * This accessLevel attributes is used to identify, the immediate parent
	 * node for appending the data.
	 */
	private String accessLevelCityName;	
	private String accessLevelMicromarketName;
	private String accessLevelResidenceName;
	private int accessLevel;
	
	private List<TodayReportRecordDto> records;
}
