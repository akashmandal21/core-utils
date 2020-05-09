package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CITYEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CITYRepository extends JpaRepository<CITYEntity, Integer>, JpaSpecificationExecutor<CITYEntity> {

}