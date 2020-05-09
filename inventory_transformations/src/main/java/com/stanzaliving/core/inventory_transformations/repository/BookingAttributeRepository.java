package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingAttributeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookingAttributeRepository extends JpaRepository<BookingAttributeEntity, Integer>, JpaSpecificationExecutor<BookingAttributeEntity> {

}