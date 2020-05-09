package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentCurrentCommercialsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentCurrentCommercialsRepository extends JpaRepository<StudentCurrentCommercialsEntity, Integer>, JpaSpecificationExecutor<StudentCurrentCommercialsEntity> {

}