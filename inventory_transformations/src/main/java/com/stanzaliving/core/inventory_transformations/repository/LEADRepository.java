package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.LeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LEADRepository extends JpaRepository<LeadEntity, Integer>, JpaSpecificationExecutor<LeadEntity> {

}