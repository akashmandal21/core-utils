package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TemporaryInvoiceLineItemDump26;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TemporaryInvoiceLineItemDump26Repository extends JpaRepository<TemporaryInvoiceLineItemDump26, Integer>, JpaSpecificationExecutor<TemporaryInvoiceLineItemDump26> {

}