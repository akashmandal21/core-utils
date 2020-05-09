package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingCancelledStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingCancelledStatusRepository extends JpaRepository<BookingCancelledStatusEntity, Integer>, JpaSpecificationExecutor<BookingCancelledStatusEntity> {

}