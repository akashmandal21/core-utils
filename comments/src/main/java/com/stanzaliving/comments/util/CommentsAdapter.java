package com.stanzaliving.comments.util;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import com.stanzaliving.comments.dto.CommentsDto;
import com.stanzaliving.comments.entity.CommentsEntity;
import com.stanzaliving.core.base.common.dto.PageResponse;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CommentsAdapter {

	public CommentsDto toDto(CommentsEntity commentsEntity,Map<String, String> userIdVsName) {

		return CommentsDto.builder().commentBy(userIdVsName.get(commentsEntity.getCreatedBy()))
				.commentId(commentsEntity.getId()).commentText(commentsEntity.getCommentText())
				.commentTime(commentsEntity.getCreatedAt()).contextId(commentsEntity.getContextId())
				.contextType(commentsEntity.getContextType()).build();

	}
	
	public CommentsDto toDto(CommentsEntity commentsEntity) {

		return CommentsDto.builder().commentBy(commentsEntity.getCreatedBy())
				.commentId(commentsEntity.getId()).commentText(commentsEntity.getCommentText())
				.commentTime(commentsEntity.getCreatedAt()).contextId(commentsEntity.getContextId())
				.contextType(commentsEntity.getContextType()).build();

	}


	public CommentsEntity toEntity(CommentsDto commentsDto) {

		return CommentsEntity.builder().createdBy(commentsDto.getCommentBy()).commentText(commentsDto.getCommentText())
				.contextId(commentsDto.getContextId()).contextType(commentsDto.getContextType()).build();

	}
	
	public PageResponse<CommentsDto> getPageResponse(Page<CommentsEntity> page,Map<String, String> userIdVsNames){
		
		PageResponse<CommentsDto> response = new PageResponse<>();
		
		response.setPage(page.getNumber());
		response.setRecords(page.getNumberOfElements());
		response.setTotalPages(page.getTotalPages());
		response.setTotalRecords(page.getTotalElements());
		
		List<CommentsDto> dtos = page.getContent().stream().map(entity->toDto(entity, userIdVsNames)).collect(Collectors.toList());
		
		response.setData(dtos);
		
		return response;
	}

}
