package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ROOMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ROOMRepository extends JpaRepository<ROOMEntity, Integer>, JpaSpecificationExecutor<ROOMEntity> {

}