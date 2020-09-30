/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.leaddashboard.enums.TimelineStatusEnum;
import com.stanzaliving.core.leaddashboard.enums.LeadDropTypeEnum;
import com.stanzaliving.core.leaddashboard.enums.LeadQualifiedEnum;
import com.stanzaliving.core.leaddashboard.enums.LeadSourceEnum;
import com.stanzaliving.core.leaddashboard.enums.PropertyTypeEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class LeadDetailRequestDto {

	private String phone;
	private LeadSourceEnum leadSource;
	private String city;
	private String micromarketName;
	private String leadOwnerEmail;
	private String lastPropertyVisited;
	
	private TimelineStatusEnum currentLeadStatus;
	private LeadQualifiedEnum qualified;
	private LeadDropTypeEnum dropType;
	private PropertyTypeEnum propertyType;
	
	private boolean visitSchedule;
	private boolean visitCompleted;
	private boolean booked;
	private boolean dropped;
	
//	private Date visitScheduledDate;
//	private Date visitCompletedMarkedDate;
//	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="Asia/Kolkata")
	private Date postVisitDroppedMarkedDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone="Asia/Kolkata")
	private Date bookedTime;
	
	private String leadCreationDate;
}
