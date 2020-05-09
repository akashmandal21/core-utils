package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.AncillaryServicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AncillaryServicesRepository extends JpaRepository<AncillaryServicesEntity, Integer>, JpaSpecificationExecutor<AncillaryServicesEntity> {

}