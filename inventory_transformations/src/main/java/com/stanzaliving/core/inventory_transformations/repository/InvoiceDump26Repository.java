package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InvoiceDump26Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceDump26Repository extends JpaRepository<InvoiceDump26Entity, Integer>, JpaSpecificationExecutor<InvoiceDump26Entity> {

}