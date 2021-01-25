/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import java.util.List;

import com.stanzaliving.core.leaddashboard.enums.LeadSourceEnum;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class TodayReportGraphRequestDto {

	private String selectedDate;
	private List<String> city;
	private List<String> micromarket;
	private List<String> residence;
	private List<LeadSourceEnum> leadSource;
	
	private int days;
}
