package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.OpsResidenceMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OpsResidenceMappingRepository extends JpaRepository<OpsResidenceMappingEntity, Void>, JpaSpecificationExecutor<OpsResidenceMappingEntity> {

}