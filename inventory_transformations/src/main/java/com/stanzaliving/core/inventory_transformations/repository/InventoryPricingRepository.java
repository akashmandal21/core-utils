package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InventoryPricingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InventoryPricingRepository extends JpaRepository<InventoryPricingEntity, Integer>, JpaSpecificationExecutor<InventoryPricingEntity> {

}