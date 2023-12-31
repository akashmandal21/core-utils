package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TemporaryInvoiceLineItemDump26Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface TemporaryInvoiceLineItemDump26Repository extends JpaRepository<TemporaryInvoiceLineItemDump26Entity, Integer>, JpaSpecificationExecutor<TemporaryInvoiceLineItemDump26Entity> {

}