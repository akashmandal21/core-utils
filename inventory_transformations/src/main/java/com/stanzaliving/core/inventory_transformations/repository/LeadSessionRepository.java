package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.LeadSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface LeadSessionRepository extends JpaRepository<LeadSessionEntity, Integer>, JpaSpecificationExecutor<LeadSessionEntity> {

}