package com.stanzaliving.comments.service.impl;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.stanzaliving.comments.db.service.CommentsDbService;
import com.stanzaliving.comments.dto.CommentsDto;
import com.stanzaliving.comments.entity.CommentsEntity;
import com.stanzaliving.comments.http.service.UserClientService;
import com.stanzaliving.comments.service.CommentsService;
import com.stanzaliving.comments.util.CommentsAdapter;
import com.stanzaliving.core.base.common.dto.PageResponse;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	private CommentsDbService commentsDbService;
	
	@Autowired
	private UserClientService userHttpService;
	
	@Override
	public CommentsDto post(CommentsDto commentsDto) {

		log.info("Posting comment ["+commentsDto+"]");
		
		CommentsEntity commentsEntity = CommentsAdapter.toEntity(commentsDto);
		
		if(java.util.Objects.nonNull(commentsEntity)) {
			
			log.info("Comment saved in database ["+commentsEntity+"]");
			
			CommentsEntity fromDb = commentsDbService.save(commentsEntity);
			
			return (java.util.Objects.nonNull(fromDb))?CommentsAdapter.toDto(commentsEntity):null;
		}
		
		return null;
	}

	@Override
	public PageResponse<CommentsDto> get(String contextId, String contextType, int pageNum, int pageSize) {

		log.info("Got request for getting comments for ["+contextId+"] and ["+contextType+"]");
		
		Page<CommentsEntity> page = commentsDbService.listComments(contextId, contextType, pageNum, pageSize);
		
		if(Objects.nonNull(page) && page.hasContent()) {
			
			Set<String> userIds = page.getContent().stream().map(CommentsEntity::getCreatedBy).collect(Collectors.toSet());
			
			return CommentsAdapter.getPageResponse(page, userHttpService.findUserNames(new ArrayList<>(userIds)));
		}
		
		return null;
	}

}
