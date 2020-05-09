package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.JOBSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JOBSRepository extends JpaRepository<JOBSEntity, Integer>, JpaSpecificationExecutor<JOBSEntity> {

}