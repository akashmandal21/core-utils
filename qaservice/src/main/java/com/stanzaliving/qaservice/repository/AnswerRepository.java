package com.stanzaliving.qaservice.repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.qaservice.entity.AnswerEntity;

public interface AnswerRepository extends AbstractJpaRepository<AnswerEntity, Long> {

    AnswerEntity findByEstateId(String estateId);

}
