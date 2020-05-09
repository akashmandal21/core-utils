package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CONSUMABLESEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CONSUMABLESRepository extends JpaRepository<CONSUMABLESEntity, Integer>, JpaSpecificationExecutor<CONSUMABLESEntity> {

}