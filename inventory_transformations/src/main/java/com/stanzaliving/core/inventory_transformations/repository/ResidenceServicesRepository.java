package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceServicesRepository extends JpaRepository<ResidenceServices, Integer>, JpaSpecificationExecutor<ResidenceServices> {

}