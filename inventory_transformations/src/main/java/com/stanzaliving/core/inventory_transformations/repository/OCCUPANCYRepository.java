package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.OccupancyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OCCUPANCYRepository extends JpaRepository<OccupancyEntity, Integer>, JpaSpecificationExecutor<OccupancyEntity> {

}