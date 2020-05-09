package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ZONEEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ZONERepository extends JpaRepository<ZONEEntity, Integer>, JpaSpecificationExecutor<ZONEEntity> {

}