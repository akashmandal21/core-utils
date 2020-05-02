package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CommercialCardBookingAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommercialCardBookingAuditRepository extends JpaRepository<CommercialCardBookingAudit, Integer>, JpaSpecificationExecutor<CommercialCardBookingAudit> {

}