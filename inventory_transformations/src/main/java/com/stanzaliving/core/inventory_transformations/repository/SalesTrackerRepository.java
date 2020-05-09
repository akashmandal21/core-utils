package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.SalesTrackerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalesTrackerRepository extends JpaRepository<SalesTrackerEntity, Integer>, JpaSpecificationExecutor<SalesTrackerEntity> {

}