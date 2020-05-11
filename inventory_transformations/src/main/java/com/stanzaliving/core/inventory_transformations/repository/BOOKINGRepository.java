package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BOOKINGRepository extends JpaRepository<BookingEntity, Integer>, JpaSpecificationExecutor<BookingEntity> {

}