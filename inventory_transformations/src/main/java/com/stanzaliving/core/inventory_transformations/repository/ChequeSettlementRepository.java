package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ChequeSettlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ChequeSettlementRepository extends JpaRepository<ChequeSettlement, Integer>, JpaSpecificationExecutor<ChequeSettlement> {

}