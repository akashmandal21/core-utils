package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InvoiceLineItem26Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface InvoiceLineItem26Repository extends JpaRepository<InvoiceLineItem26Entity, Integer>, JpaSpecificationExecutor<InvoiceLineItem26Entity> {

}