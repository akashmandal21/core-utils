package com.stanzaliving.core.commentsservice.response.dto;

import java.util.Map;

import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.commentsservice.dto.CommentsDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class CommentsResponseDto{

	PageResponse<CommentsDto> comments;
	
	Map<String, Long> subContextCount;
}
