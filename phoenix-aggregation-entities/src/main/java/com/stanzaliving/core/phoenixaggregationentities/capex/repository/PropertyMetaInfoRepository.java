package com.stanzaliving.core.phoenixaggregationentities.capex.repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.core.phoenixaggregationentities.capex.entity.PropertyMetaInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyMetaInfoRepository extends AbstractJpaRepository<PropertyMetaInfo,Long> {
    PropertyMetaInfo findByPropertyUuid(String propertyUuid);
}
