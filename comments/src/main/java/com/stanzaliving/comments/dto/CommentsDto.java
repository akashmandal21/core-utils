package com.stanzaliving.comments.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@ToString
@Setter
public class CommentsDto {

	private long commentId;

	private Date commentTime;

	private String commentBy;

	@NotNull(message = "Please enter comment text")
	private String commentText;

	@NotNull(message = "Please enter context id")
	private String contextId;

	private String contextType;
}
