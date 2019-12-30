package com.stanzaliving.core.commentsservice.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

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

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm a z")
	private Date commentTime;

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
}
