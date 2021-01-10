package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.MisCsvSettlementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface MisCsvSettlementRepository extends JpaRepository<MisCsvSettlementEntity, Integer>, JpaSpecificationExecutor<MisCsvSettlementEntity> {

}