package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.DISCOUNTEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DISCOUNTRepository extends JpaRepository<DISCOUNTEntity, String>, JpaSpecificationExecutor<DISCOUNTEntity> {

}