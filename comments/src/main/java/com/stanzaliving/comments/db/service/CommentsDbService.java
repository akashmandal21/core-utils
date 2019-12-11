package com.stanzaliving.comments.db.service;

import org.springframework.data.domain.Page;

import com.stanzaliving.comments.entity.CommentsEntity;
import com.stanzaliving.core.sqljpa.service.AbstractJpaService;

public interface CommentsDbService extends AbstractJpaService<CommentsEntity, Long>{

	Page<CommentsEntity> listComments(String contextId,String contextType,int pageNum,int pageSize);

}
