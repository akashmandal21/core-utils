package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TransactionSettlementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionSettlementsRepository extends JpaRepository<TransactionSettlementsEntity, Integer>, JpaSpecificationExecutor<TransactionSettlementsEntity> {

}