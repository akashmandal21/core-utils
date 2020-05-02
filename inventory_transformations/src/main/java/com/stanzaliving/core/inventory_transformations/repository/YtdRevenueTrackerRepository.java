package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.YtdRevenueTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface YtdRevenueTrackerRepository extends JpaRepository<YtdRevenueTracker, Integer>, JpaSpecificationExecutor<YtdRevenueTracker> {

}