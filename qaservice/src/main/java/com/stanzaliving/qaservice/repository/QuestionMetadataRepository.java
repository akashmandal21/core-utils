package com.stanzaliving.qaservice.repository;

import org.springframework.stereotype.Repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.qaservice.entity.QuestionMetadataEntity;

@Repository
public interface QuestionMetadataRepository extends AbstractJpaRepository<QuestionMetadataEntity, Long> {

}
