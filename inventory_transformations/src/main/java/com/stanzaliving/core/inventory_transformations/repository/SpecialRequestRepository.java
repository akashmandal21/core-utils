package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.SpecialRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SpecialRequestRepository extends JpaRepository<SpecialRequest, Integer>, JpaSpecificationExecutor<SpecialRequest> {

}