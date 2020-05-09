package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceHscCodesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceHscCodesRepository extends JpaRepository<ResidenceHscCodesEntity, String>, JpaSpecificationExecutor<ResidenceHscCodesEntity> {

}