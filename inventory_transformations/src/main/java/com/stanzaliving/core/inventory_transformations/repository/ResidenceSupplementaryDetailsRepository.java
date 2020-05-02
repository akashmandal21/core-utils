package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceSupplementaryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceSupplementaryDetailsRepository extends JpaRepository<ResidenceSupplementaryDetails, Integer>, JpaSpecificationExecutor<ResidenceSupplementaryDetails> {

}