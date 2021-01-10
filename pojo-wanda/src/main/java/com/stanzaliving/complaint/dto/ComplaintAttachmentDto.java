package com.stanzaliving.complaint.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class ComplaintAttachmentDto {
	
	private String attachmentName;
	
	private String attachmentType;
	
	private String attachmentpath;
	
	private String attachmentBucket;
	
	private String attachmentUrl;
	
	private String attachmentUuid;

}