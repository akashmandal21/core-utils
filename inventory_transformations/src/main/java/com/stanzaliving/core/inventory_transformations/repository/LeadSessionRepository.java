package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.LeadSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadSessionRepository extends JpaRepository<LeadSession, Integer>, JpaSpecificationExecutor<LeadSession> {

}