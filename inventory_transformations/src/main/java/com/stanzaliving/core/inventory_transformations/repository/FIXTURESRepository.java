package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.FIXTURESEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FIXTURESRepository extends JpaRepository<FIXTURESEntity, Integer>, JpaSpecificationExecutor<FIXTURESEntity> {

}