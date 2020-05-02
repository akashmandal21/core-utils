package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InvoiceLineItem26;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceLineItem26Repository extends JpaRepository<InvoiceLineItem26, Integer>, JpaSpecificationExecutor<InvoiceLineItem26> {

}