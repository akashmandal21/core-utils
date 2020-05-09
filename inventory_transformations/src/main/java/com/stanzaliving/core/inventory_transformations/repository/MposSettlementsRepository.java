package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.MposSettlementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MposSettlementsRepository extends JpaRepository<MposSettlementsEntity, Integer>, JpaSpecificationExecutor<MposSettlementsEntity> {

}