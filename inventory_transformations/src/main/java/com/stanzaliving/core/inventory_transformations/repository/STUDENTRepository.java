package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.STUDENTEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface STUDENTRepository extends JpaRepository<STUDENTEntity, String>, JpaSpecificationExecutor<STUDENTEntity> {

}