package com.stanzaliving.core.phoenix.agg.repository;

import com.stanzaliving.core.phoenix.agg.entity.PhoenixAggregationView;
import com.stanzaliving.core.mongobase.repository.AbstractMongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhoenixAggregationViewRepository extends AbstractMongoRepository<PhoenixAggregationView, String> {

    @Query("{'propertyBasicInfo.estateInfo.estateUuid': ?0}")
    Optional<PhoenixAggregationView> findByEstateUuid(final String estateUuid);

    @Query("{'propertyBasicInfo.propertyUuid': ?0}")
    Optional<PhoenixAggregationView> findByPropertyUuid(final String propertyUuid);


}
