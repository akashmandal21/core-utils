package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CommercialCardBookingAuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommercialCardBookingAuditRepository extends JpaRepository<CommercialCardBookingAuditEntity, Integer>, JpaSpecificationExecutor<CommercialCardBookingAuditEntity> {

}