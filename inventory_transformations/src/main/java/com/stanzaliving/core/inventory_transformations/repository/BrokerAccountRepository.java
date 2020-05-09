package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BrokerAccountRepository extends JpaRepository<BrokerAccountEntity, Integer>, JpaSpecificationExecutor<BrokerAccountEntity> {

}