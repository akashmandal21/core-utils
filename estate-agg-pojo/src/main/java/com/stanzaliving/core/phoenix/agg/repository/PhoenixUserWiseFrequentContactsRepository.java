package com.stanzaliving.core.phoenix.agg.repository;

import com.stanzaliving.core.mongobase.repository.AbstractMongoRepository;
import com.stanzaliving.core.phoenix.agg.entity.PhoenixAggregationView;
import com.stanzaliving.core.phoenix.agg.entity.PhoenixUserWiseFrequentContacts;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PhoenixUserWiseFrequentContactsRepository extends AbstractMongoRepository<PhoenixUserWiseFrequentContacts, String> {

    @Query("{'userUuid': ?0}")
    List<PhoenixUserWiseFrequentContacts> findByUserUuid(final String userUuid);

    @Query("{'propertyUuid': ?0,'userUuid': ?0}")
    Optional<PhoenixUserWiseFrequentContacts> findByPropertyUuidAndUserUuid(final String propertyUuid,final String userUuid);
}
