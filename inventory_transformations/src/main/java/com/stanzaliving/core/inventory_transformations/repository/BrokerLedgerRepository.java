package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerLedgerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BrokerLedgerRepository extends JpaRepository<BrokerLedgerEntity, Integer>, JpaSpecificationExecutor<BrokerLedgerEntity> {

}