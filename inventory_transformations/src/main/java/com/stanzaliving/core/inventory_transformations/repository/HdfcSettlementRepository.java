package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.HdfcSettlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HdfcSettlementRepository extends JpaRepository<HdfcSettlement, Integer>, JpaSpecificationExecutor<HdfcSettlement> {

}