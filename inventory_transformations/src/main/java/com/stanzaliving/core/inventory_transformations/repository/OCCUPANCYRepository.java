package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.OCCUPANCY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OCCUPANCYRepository extends JpaRepository<OCCUPANCY, Integer>, JpaSpecificationExecutor<OCCUPANCY> {

}