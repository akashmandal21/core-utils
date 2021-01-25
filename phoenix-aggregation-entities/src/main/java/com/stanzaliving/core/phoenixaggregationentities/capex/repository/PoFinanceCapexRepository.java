package com.stanzaliving.core.phoenixaggregationentities.capex.repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.core.phoenixaggregationentities.capex.entity.PoFinanceCapexAggregation;
import org.springframework.transaction.annotation.Transactional;

public interface PoFinanceCapexRepository extends AbstractJpaRepository<PoFinanceCapexAggregation,Long> {
    @Transactional
    long deleteByPropertyMetaInfoUuid(String propertyMetaInfoUuid);
}
