package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TemporaryInvoiceLineItemAudit1Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface TemporaryInvoiceLineItemAudit1Repository extends JpaRepository<TemporaryInvoiceLineItemAudit1Entity, Integer>, JpaSpecificationExecutor<TemporaryInvoiceLineItemAudit1Entity> {

}