package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.LeadVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadVisitRepository extends JpaRepository<LeadVisit, Integer>, JpaSpecificationExecutor<LeadVisit> {

}