package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidencePaymentTerm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidencePaymentTermRepository extends JpaRepository<ResidencePaymentTerm, Integer>, JpaSpecificationExecutor<ResidencePaymentTerm> {

}