package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InstitutionAccountingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InstitutionAccountingDetailsRepository extends JpaRepository<InstitutionAccountingDetails, Integer>, JpaSpecificationExecutor<InstitutionAccountingDetails> {

}