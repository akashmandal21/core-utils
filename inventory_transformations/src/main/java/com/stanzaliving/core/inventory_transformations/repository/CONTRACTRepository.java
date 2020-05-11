package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CONTRACTRepository extends JpaRepository<ContractEntity, Integer>, JpaSpecificationExecutor<ContractEntity> {

}