package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceTypeAuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceTypeAuditRepository extends JpaRepository<ResidenceTypeAuditEntity, Integer>, JpaSpecificationExecutor<ResidenceTypeAuditEntity> {

}