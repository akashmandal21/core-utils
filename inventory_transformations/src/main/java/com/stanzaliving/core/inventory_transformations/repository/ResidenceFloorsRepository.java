package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceFloors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceFloorsRepository extends JpaRepository<ResidenceFloors, Void>, JpaSpecificationExecutor<ResidenceFloors> {

}