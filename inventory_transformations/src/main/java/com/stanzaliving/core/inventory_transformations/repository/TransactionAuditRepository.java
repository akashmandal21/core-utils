package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TransactionAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionAuditRepository extends JpaRepository<TransactionAudit, Integer>, JpaSpecificationExecutor<TransactionAudit> {

}