package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingAttributeAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingAttributeAuditRepository extends JpaRepository<BookingAttributeAudit, Integer>, JpaSpecificationExecutor<BookingAttributeAudit> {

}