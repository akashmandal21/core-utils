package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PERMISSIONSEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PERMISSIONSRepository extends JpaRepository<PERMISSIONSEntity, Integer>, JpaSpecificationExecutor<PERMISSIONSEntity> {

}