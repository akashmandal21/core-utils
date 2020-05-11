package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ZoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ZONERepository extends JpaRepository<ZoneEntity, Integer>, JpaSpecificationExecutor<ZoneEntity> {

}