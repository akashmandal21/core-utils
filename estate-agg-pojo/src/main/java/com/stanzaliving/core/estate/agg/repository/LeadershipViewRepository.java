package com.stanzaliving.core.estate.agg.repository;

import com.stanzaliving.core.estate.agg.entity.LeadershipViewEntity;
import com.stanzaliving.core.mongobase.repository.AbstractMongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface LeadershipViewRepository extends AbstractMongoRepository<LeadershipViewEntity, String> {

    @Query("{'estateInfo.estateUuid': ?0}")
    Optional<LeadershipViewEntity> findByEstateUuid(final String estateUuid);

    @Query("{'estateInfo.estateId': ?0}")
    Optional<LeadershipViewEntity> findByEstateId(final Long estateId);
}
