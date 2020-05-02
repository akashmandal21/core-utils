package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.LeadMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadModeRepository extends JpaRepository<LeadMode, Integer>, JpaSpecificationExecutor<LeadMode> {

}