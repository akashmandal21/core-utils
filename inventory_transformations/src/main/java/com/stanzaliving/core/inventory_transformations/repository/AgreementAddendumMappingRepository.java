package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.AgreementAddendumMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AgreementAddendumMappingRepository extends JpaRepository<AgreementAddendumMapping, Integer>, JpaSpecificationExecutor<AgreementAddendumMapping> {

}