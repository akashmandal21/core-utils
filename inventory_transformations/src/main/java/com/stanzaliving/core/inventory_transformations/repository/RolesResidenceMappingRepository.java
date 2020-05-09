package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RolesResidenceMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RolesResidenceMappingRepository extends JpaRepository<RolesResidenceMappingEntity, Integer>, JpaSpecificationExecutor<RolesResidenceMappingEntity> {

}