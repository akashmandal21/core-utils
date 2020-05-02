package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PaymonkSettlementOffline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymonkSettlementOfflineRepository extends JpaRepository<PaymonkSettlementOffline, Integer>, JpaSpecificationExecutor<PaymonkSettlementOffline> {

}