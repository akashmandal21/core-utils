package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.AgreementBookingMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AgreementBookingMappingRepository extends JpaRepository<AgreementBookingMapping, Integer>, JpaSpecificationExecutor<AgreementBookingMapping> {

}