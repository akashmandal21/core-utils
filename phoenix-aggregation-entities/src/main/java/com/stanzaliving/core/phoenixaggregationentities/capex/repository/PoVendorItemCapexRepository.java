package com.stanzaliving.core.phoenixaggregationentities.capex.repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.core.phoenixaggregationentities.capex.entity.PoVendorItemCapexAggregation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PoVendorItemCapexRepository extends AbstractJpaRepository<PoVendorItemCapexAggregation,Long> {
    @Transactional
    long deleteByPropertyMetaInfoUuid(String propertyMetaInfoUuid);
}
