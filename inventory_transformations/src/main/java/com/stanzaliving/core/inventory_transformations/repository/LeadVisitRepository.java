package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.LeadVisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadVisitRepository extends JpaRepository<LeadVisitEntity, Integer>, JpaSpecificationExecutor<LeadVisitEntity> {

}