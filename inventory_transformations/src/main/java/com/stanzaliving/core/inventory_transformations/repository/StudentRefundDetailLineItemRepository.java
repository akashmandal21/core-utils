package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentRefundDetailLineItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRefundDetailLineItemRepository extends JpaRepository<StudentRefundDetailLineItemEntity, Integer>, JpaSpecificationExecutor<StudentRefundDetailLineItemEntity> {

}