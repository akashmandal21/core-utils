package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InvoiceTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface InvoiceTransactionRepository extends JpaRepository<InvoiceTransactionEntity, Integer>, JpaSpecificationExecutor<InvoiceTransactionEntity> {

}