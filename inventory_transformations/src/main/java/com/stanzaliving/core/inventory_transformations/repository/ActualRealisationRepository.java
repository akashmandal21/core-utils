package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ActualRealisationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ActualRealisationRepository extends JpaRepository<ActualRealisationEntity, Integer>, JpaSpecificationExecutor<ActualRealisationEntity> {

}