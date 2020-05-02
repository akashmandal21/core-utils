package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.LeadClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LeadClientRepository extends JpaRepository<LeadClient, Integer>, JpaSpecificationExecutor<LeadClient> {

}