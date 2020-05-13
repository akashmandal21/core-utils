package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TemporaryInvoiceLineItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface TemporaryInvoiceLineItemRepository extends JpaRepository<TemporaryInvoiceLineItemEntity, Integer>, JpaSpecificationExecutor<TemporaryInvoiceLineItemEntity> {

}