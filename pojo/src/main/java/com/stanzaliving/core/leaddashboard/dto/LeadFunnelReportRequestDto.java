/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString(callSuper = true)
public class LeadFunnelReportRequestDto extends TodayReportRequestDto {

	private String leadCreationFromDate;
	private String leadCreationToDate;
}
