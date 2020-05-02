package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BrokerAccountRepository extends JpaRepository<BrokerAccount, Integer>, JpaSpecificationExecutor<BrokerAccount> {

}