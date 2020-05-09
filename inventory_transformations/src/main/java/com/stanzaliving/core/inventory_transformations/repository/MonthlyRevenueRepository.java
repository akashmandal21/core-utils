package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.MonthlyRevenueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MonthlyRevenueRepository extends JpaRepository<MonthlyRevenueEntity, Integer>, JpaSpecificationExecutor<MonthlyRevenueEntity> {

}