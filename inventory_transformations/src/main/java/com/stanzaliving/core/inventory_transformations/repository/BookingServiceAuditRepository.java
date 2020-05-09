package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingServiceAuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingServiceAuditRepository extends JpaRepository<BookingServiceAuditEntity, Integer>, JpaSpecificationExecutor<BookingServiceAuditEntity> {

}