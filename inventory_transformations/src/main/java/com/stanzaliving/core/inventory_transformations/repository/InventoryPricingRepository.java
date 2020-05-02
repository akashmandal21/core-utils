package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InventoryPricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InventoryPricingRepository extends JpaRepository<InventoryPricing, Integer>, JpaSpecificationExecutor<InventoryPricing> {

}