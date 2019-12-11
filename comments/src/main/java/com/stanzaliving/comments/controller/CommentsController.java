package com.stanzaliving.comments.controller;

import java.util.Objects;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stanzaliving.comments.dto.CommentsDto;
import com.stanzaliving.comments.service.CommentsService;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.core.base.common.dto.ResponseDto;
import com.stanzaliving.core.sqljpa.SecurityUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;

@RestController
@Api
@Log4j2
@RequestMapping("/comments")
public class CommentsController {

	@Autowired
	private CommentsService commentsService;
	
	@Value("${spring.application.name}")
	private String contextName;
	
	@PostMapping("/post")
	@ApiOperation(value = "Post Comment")
	public ResponseDto<CommentsDto> postComment(@RequestBody CommentsDto commentsDto) {

		log.info("Got request to post comment ["+commentsDto+"]");
		
		String userId = SecurityUtil.getCurrentUserId();
		
		if(Objects.isNull(userId)) {
			return ResponseDto.failure("Unable to post comment as user id not found in current context");
		}
		
		commentsDto.setCommentBy(userId);
		commentsDto.setContextType(contextName);
		
		commentsDto = commentsService.post(commentsDto);
		
		return (Objects.nonNull(commentsDto))?ResponseDto.success("Comment posted!!",commentsDto):ResponseDto.failure("Unable to post comment");
		
	}
	
	@GetMapping("/get/{contextId}/{pageNum}/{pageSize}")
	@ApiOperation(value = "Get Comment")
	public ResponseDto<PageResponse<CommentsDto>> postComment(@PathParam("contextId") String contextId,@PathParam("pageNum") int pageNum,@PathParam("pageSize") int pageSize) {

		log.info("Got request to get comment list for ["+contextId+"] ["+pageNum+"] ["+pageSize+"]");
		
		PageResponse<CommentsDto> commentsDtos = commentsService.get(contextId, contextName, pageNum, pageSize);
		
		return (Objects.nonNull(commentsDtos)&& commentsDtos.getRecords() > 0)?ResponseDto.success("Got ["+commentsDtos.getRecords()+"] for the given request!Q",commentsDtos):ResponseDto.failure("Unable to get comments");
		
	}
}
