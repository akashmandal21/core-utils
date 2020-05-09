package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerLeadTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BrokerLeadTransactionRepository extends JpaRepository<BrokerLeadTransactionEntity, Integer>, JpaSpecificationExecutor<BrokerLeadTransactionEntity> {

}