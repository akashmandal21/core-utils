package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TemporaryInvoiceLineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TemporaryInvoiceLineItemRepository extends JpaRepository<TemporaryInvoiceLineItem, Integer>, JpaSpecificationExecutor<TemporaryInvoiceLineItem> {

}