package com.stanzaliving.core.phoenix.agg.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.stanzaliving.core.mongobase.repository.AbstractMongoRepository;
import com.stanzaliving.core.phoenix.agg.entity.PhoenixAggregationView;

@Repository
public interface PhoenixAggregationViewRepository extends AbstractMongoRepository<PhoenixAggregationView, String> {

    @Query("{'propertyBasicInfo.estateInfo.estateUuid': ?0}")
    Optional<PhoenixAggregationView> findByEstateUuid(final String estateUuid);

    @Query("{'propertyBasicInfo.propertyUuid': ?0}")
    Optional<PhoenixAggregationView> findByPropertyUuid(final String propertyUuid);


}