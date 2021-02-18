package com.stanzaliving.core.commentsservice.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CommentsCountResponseDto {

	@EqualsAndHashCode.Include
	private String contextId;

	@EqualsAndHashCode.Include
	private String subContextId;

	private Integer count;

}
