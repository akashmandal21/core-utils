package com.stanzaliving.complaint.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ComplaintAttachmentDto {
	
	private String attachmentName;
	
	private String attachmentType;
	
	private String attachmentpath;
	
	private String attachmentBucket;
	
	private String attachmentUrl;
	
	private String attachmentUuid;

}