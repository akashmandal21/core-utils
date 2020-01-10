package com.stanzaliving.qaservice.repository;

import org.springframework.stereotype.Repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.qaservice.entity.QuestionEntity;

@Repository
public interface QuestionRepository extends AbstractJpaRepository<QuestionEntity, Long> {
	
}