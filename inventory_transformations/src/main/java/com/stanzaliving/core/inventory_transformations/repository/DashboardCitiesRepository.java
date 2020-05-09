package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.DashboardCitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DashboardCitiesRepository extends JpaRepository<DashboardCitiesEntity, Integer>, JpaSpecificationExecutor<DashboardCitiesEntity> {

}