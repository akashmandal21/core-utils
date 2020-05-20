package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceAncillaryServicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface ResidenceAncillaryServicesRepository extends JpaRepository<ResidenceAncillaryServicesEntity, Integer>, JpaSpecificationExecutor<ResidenceAncillaryServicesEntity> {

}