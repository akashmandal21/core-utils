package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BookingCancelledStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingCancelledStatusRepository extends JpaRepository<BookingCancelledStatusEntity, Integer>, JpaSpecificationExecutor<BookingCancelledStatusEntity> {

}