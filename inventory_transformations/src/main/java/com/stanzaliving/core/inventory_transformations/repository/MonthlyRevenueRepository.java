package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.MonthlyRevenueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface MonthlyRevenueRepository extends JpaRepository<MonthlyRevenueEntity, Integer>, JpaSpecificationExecutor<MonthlyRevenueEntity> {

}