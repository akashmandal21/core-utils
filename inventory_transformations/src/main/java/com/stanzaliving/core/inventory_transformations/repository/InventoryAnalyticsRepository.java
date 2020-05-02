package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InventoryAnalytics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InventoryAnalyticsRepository extends JpaRepository<InventoryAnalytics, Void>, JpaSpecificationExecutor<InventoryAnalytics> {

}