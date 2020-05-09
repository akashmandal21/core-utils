package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RblTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RblTransactionRepository extends JpaRepository<RblTransactionEntity, Integer>, JpaSpecificationExecutor<RblTransactionEntity> {

}