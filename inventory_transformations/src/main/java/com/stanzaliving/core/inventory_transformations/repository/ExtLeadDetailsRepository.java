package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ExtLeadDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ExtLeadDetailsRepository extends JpaRepository<ExtLeadDetails, Integer>, JpaSpecificationExecutor<ExtLeadDetails> {

}