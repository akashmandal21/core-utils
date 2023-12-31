package com.stanzaliving.core.commentsservice.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Convert;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommentsDto {

	private Long commentId;

	private String commentUuid;

	private Date commentTime;
	
	private String commentTimeText;

	private String commentBy;
	
	private boolean selfComment;
	
	private String commentTitle;

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

	private String parentCommentUuid;
	
	private Object metaData;

	private List<CommentsDto> childComments;
}
