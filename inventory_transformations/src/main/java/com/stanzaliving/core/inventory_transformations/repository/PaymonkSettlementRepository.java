package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PaymonkSettlementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymonkSettlementRepository extends JpaRepository<PaymonkSettlementEntity, String>, JpaSpecificationExecutor<PaymonkSettlementEntity> {

}