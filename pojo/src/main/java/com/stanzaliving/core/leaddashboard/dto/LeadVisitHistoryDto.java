/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.leaddashboard.enums.LeadSourceEnum;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class LeadVisitHistoryDto {

	private String phone;
	private String firstName;
	private String lastName;
	private int visitCount;

	@JsonFormat(shape = JsonFormat.Shape.STRING, timezone="Asia/Kolkata")
	private Date visitScheduledDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, timezone="Asia/Kolkata")
	private Date visitCompletedDate;
	private String residenceVisited;
	private String visitorHostEmail;
	
	private String micromarketName;
	private String city;
	private LeadSourceEnum leadSource;
	
	private String leadVisitHistoryUuid;
	
	private String leadVisitHistoryDate;
}
