package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.MisCsvSettlementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MisCsvSettlementRepository extends JpaRepository<MisCsvSettlementEntity, Integer>, JpaSpecificationExecutor<MisCsvSettlementEntity> {

}