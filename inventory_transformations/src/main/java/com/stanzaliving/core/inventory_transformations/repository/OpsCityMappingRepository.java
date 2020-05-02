package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.OpsCityMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OpsCityMappingRepository extends JpaRepository<OpsCityMapping, Void>, JpaSpecificationExecutor<OpsCityMapping> {

}