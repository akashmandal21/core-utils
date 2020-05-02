package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceAncillaryServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceAncillaryServicesRepository extends JpaRepository<ResidenceAncillaryServices, Integer>, JpaSpecificationExecutor<ResidenceAncillaryServices> {

}