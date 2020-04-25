package com.stanzaliving.core.phoenix.agg.repository;

import com.stanzaliving.core.mongobase.repository.AbstractMongoRepository;
import com.stanzaliving.core.phoenix.agg.entity.PhoenixUserPropertyFrequentContacts;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PhoenixUserPropertyFrequentContactsRepository extends AbstractMongoRepository<PhoenixUserPropertyFrequentContacts, String> {

    @Query("{'userUuid': ?0}")
    List<PhoenixUserPropertyFrequentContacts> findByUserUuid(final String userUuid);

    @Query("{'propertyUuid': ?0,'userUuid': ?0}")
    Optional<PhoenixUserPropertyFrequentContacts> findByPropertyUuidAndUserUuid(final String propertyUuid, final String userUuid);
}
