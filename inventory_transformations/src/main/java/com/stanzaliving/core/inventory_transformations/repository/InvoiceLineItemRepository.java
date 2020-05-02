package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InvoiceLineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceLineItemRepository extends JpaRepository<InvoiceLineItem, Integer>, JpaSpecificationExecutor<InvoiceLineItem> {

}