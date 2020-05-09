package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BOOKINGEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BOOKINGRepository extends JpaRepository<BOOKINGEntity, Integer>, JpaSpecificationExecutor<BOOKINGEntity> {

}