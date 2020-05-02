package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InvoiceTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoiceTransactionRepository extends JpaRepository<InvoiceTransaction, Integer>, JpaSpecificationExecutor<InvoiceTransaction> {

}