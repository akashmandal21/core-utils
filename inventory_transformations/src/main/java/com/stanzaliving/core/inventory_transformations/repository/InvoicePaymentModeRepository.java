package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InvoicePaymentModeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InvoicePaymentModeRepository extends JpaRepository<InvoicePaymentModeEntity, Void>, JpaSpecificationExecutor<InvoicePaymentModeEntity> {

}