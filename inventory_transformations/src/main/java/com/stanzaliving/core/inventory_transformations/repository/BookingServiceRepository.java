package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingServiceRepository extends JpaRepository<BookingServiceEntity, Integer>, JpaSpecificationExecutor<BookingServiceEntity> {

}