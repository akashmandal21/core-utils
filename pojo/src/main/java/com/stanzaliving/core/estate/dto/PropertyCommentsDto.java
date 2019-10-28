package com.stanzaliving.core.estate.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PropertyCommentsDto {

	private long commentId;
	
	private Date commentTime;
	
	private String commentBy;
	
	private String commentText;
	
	private String propertyId;
}
