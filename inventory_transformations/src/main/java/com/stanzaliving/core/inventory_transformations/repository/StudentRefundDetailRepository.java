package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentRefundDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRefundDetailRepository extends JpaRepository<StudentRefundDetail, Integer>, JpaSpecificationExecutor<StudentRefundDetail> {

}