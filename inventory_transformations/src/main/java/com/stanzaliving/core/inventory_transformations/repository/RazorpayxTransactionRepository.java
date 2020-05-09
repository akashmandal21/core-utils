package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RazorpayxTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RazorpayxTransactionRepository extends JpaRepository<RazorpayxTransactionEntity, Integer>, JpaSpecificationExecutor<RazorpayxTransactionEntity> {

}