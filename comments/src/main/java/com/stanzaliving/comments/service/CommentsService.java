package com.stanzaliving.comments.service;

import com.stanzaliving.comments.dto.CommentsDto;
import com.stanzaliving.core.base.common.dto.PageResponse;

public interface CommentsService {

	CommentsDto post(CommentsDto commentsDto);
	
	PageResponse<CommentsDto> get(String contextId,String contextType,int pageNum,int pageSize);
	
}
