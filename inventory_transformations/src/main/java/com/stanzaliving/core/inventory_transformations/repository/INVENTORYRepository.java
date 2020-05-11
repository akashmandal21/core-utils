package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface INVENTORYRepository extends JpaRepository<InventoryEntity, Integer>, JpaSpecificationExecutor<InventoryEntity> {

}