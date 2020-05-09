package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BROKEREntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BROKERRepository extends JpaRepository<BROKEREntity, Integer>, JpaSpecificationExecutor<BROKEREntity> {

}