package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceHscCodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceHscCodesRepository extends JpaRepository<ResidenceHscCodes, String>, JpaSpecificationExecutor<ResidenceHscCodes> {

}