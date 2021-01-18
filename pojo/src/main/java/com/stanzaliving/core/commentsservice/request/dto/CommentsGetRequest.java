package com.stanzaliving.core.commentsservice.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Builder
@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentsGetRequest {

	private String commentBy;

	private String contextId;

	private String contextType;
	
	private String serviceName;

	private String subContextId;

	private Date afterDate;
	
	private int pageNum;
	
	private int pageSize;
	
}
