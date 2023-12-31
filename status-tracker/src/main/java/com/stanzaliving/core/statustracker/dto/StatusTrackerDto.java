package com.stanzaliving.core.statustracker.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class StatusTrackerDto {

	private String contextName;

	private String status;

	private String contextUuid;

	private Date createdAt;
	
	private String createdBy;

}
