package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceContractRepository extends JpaRepository<ResidenceContract, Integer>, JpaSpecificationExecutor<ResidenceContract> {

}