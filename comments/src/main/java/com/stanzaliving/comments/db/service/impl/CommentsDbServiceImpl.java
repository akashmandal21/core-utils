package com.stanzaliving.comments.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.stanzaliving.comments.db.service.CommentsDbService;
import com.stanzaliving.comments.entity.CommentsEntity;
import com.stanzaliving.comments.repository.PropertyCommentsRepository;
import com.stanzaliving.core.sqljpa.service.impl.AbstractJpaServiceImpl;

public class CommentsDbServiceImpl extends AbstractJpaServiceImpl<CommentsEntity,Long,PropertyCommentsRepository> implements CommentsDbService {

	@Autowired
	private PropertyCommentsRepository propertyCommentsRepository;
	
	@Override
	protected PropertyCommentsRepository getJpaRepository() {
		return propertyCommentsRepository;
	}

	@Override
	public Page<CommentsEntity> listComments(String contextId, String contextType, int pageNum, int pageSize) {

		Pageable pageable = PageRequest.of(pageNum, pageSize);
		
		return propertyCommentsRepository.findByContextIdAndContextTypeOrderByCreatedAt(contextId, contextType, pageable);
		
	}

}
