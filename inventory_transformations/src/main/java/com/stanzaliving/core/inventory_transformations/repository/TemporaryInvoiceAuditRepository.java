package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TemporaryInvoiceAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TemporaryInvoiceAuditRepository extends JpaRepository<TemporaryInvoiceAudit, Integer>, JpaSpecificationExecutor<TemporaryInvoiceAudit> {

}