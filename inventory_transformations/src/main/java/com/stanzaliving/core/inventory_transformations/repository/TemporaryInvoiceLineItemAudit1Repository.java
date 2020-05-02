package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TemporaryInvoiceLineItemAudit1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TemporaryInvoiceLineItemAudit1Repository extends JpaRepository<TemporaryInvoiceLineItemAudit1, Integer>, JpaSpecificationExecutor<TemporaryInvoiceLineItemAudit1> {

}