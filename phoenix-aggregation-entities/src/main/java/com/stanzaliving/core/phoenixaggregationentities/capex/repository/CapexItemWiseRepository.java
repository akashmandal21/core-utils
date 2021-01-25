package com.stanzaliving.core.phoenixaggregationentities.capex.repository;

import com.stanzaliving.core.sqljpa.repository.AbstractJpaRepository;
import com.stanzaliving.core.phoenixaggregationentities.capex.entity.CapexItemWiseAggregation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CapexItemWiseRepository extends AbstractJpaRepository<CapexItemWiseAggregation,Long> {

    List<CapexItemWiseAggregation> findByPropertyMetaInfoUuid(String propertyMetaInfoUuid);
    @Transactional
    long deleteByPropertyMetaInfoUuid(String propertyMetaInfoUuid);

}
