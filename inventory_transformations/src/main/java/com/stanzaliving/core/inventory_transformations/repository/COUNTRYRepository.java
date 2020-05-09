package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.COUNTRYEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface COUNTRYRepository extends JpaRepository<COUNTRYEntity, Integer>, JpaSpecificationExecutor<COUNTRYEntity> {

}