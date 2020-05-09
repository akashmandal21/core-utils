package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.SpecialRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SpecialRequestRepository extends JpaRepository<SpecialRequestEntity, Integer>, JpaSpecificationExecutor<SpecialRequestEntity> {

}