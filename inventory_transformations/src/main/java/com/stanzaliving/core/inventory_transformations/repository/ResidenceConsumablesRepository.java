package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceConsumables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceConsumablesRepository extends JpaRepository<ResidenceConsumables, Integer>, JpaSpecificationExecutor<ResidenceConsumables> {

}