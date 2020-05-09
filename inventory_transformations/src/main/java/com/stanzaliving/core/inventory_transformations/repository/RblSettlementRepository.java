package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RblSettlementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RblSettlementRepository extends JpaRepository<RblSettlementEntity, Integer>, JpaSpecificationExecutor<RblSettlementEntity> {

}