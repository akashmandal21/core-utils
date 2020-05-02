package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingCommercialsAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingCommercialsAuditRepository extends JpaRepository<BookingCommercialsAudit, Integer>, JpaSpecificationExecutor<BookingCommercialsAudit> {

}