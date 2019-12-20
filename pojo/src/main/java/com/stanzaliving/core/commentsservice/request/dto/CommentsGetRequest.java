package com.stanzaliving.core.commentsservice.request.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CommentsGetRequest {

	private String commentBy;

	private String contextId;

	private String contextType;
	
	private String serviceName;

	private String subContextId;
	
	private int pageNum;
	
	private int pageSize;
	
}
