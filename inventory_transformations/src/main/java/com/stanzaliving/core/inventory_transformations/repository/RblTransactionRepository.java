package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RblTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RblTransactionRepository extends JpaRepository<RblTransaction, Integer>, JpaSpecificationExecutor<RblTransaction> {

}