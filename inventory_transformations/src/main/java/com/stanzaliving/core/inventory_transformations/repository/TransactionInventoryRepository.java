package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TransactionInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionInventoryRepository extends JpaRepository<TransactionInventoryEntity, Integer>, JpaSpecificationExecutor<TransactionInventoryEntity> {

}