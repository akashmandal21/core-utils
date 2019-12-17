package com.stanzaliving.core.commentsservice.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
@AllArgsConstructor
public class CommentsDto {

	private long commentId;

	private Date commentTime;

	private String commentBy;

	@NotNull(message = "Please enter comment text")
	private String commentText;

	@NotNull(message = "Please enter context id")
	private String contextId;

	@NotNull(message = "Please enter context type")
	private String contextType;
	
	@NotNull(message = "Please enter service name")
	private String serviceName;
	
	@NotNull(message = "Please enter sub context id")
	private String subContextId;
}
