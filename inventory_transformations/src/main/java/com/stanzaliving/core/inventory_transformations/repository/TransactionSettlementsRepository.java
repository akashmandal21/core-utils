package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TransactionSettlements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionSettlementsRepository extends JpaRepository<TransactionSettlements, Integer>, JpaSpecificationExecutor<TransactionSettlements> {

}