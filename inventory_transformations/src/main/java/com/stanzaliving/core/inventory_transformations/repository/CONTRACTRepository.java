package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CONTRACTEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CONTRACTRepository extends JpaRepository<CONTRACTEntity, Integer>, JpaSpecificationExecutor<CONTRACTEntity> {

}