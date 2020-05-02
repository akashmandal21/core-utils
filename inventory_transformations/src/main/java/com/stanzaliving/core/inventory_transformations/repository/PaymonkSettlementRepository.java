package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PaymonkSettlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymonkSettlementRepository extends JpaRepository<PaymonkSettlement, String>, JpaSpecificationExecutor<PaymonkSettlement> {

}