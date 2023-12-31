package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface INVOICERepository extends JpaRepository<InvoiceEntity, Integer>, JpaSpecificationExecutor<InvoiceEntity> {

    InvoiceEntity findFirstByStanzaInvoiceId(String stanzaInvoiceId);
}