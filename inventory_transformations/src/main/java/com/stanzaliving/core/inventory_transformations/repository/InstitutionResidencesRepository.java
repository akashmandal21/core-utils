package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InstitutionResidences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InstitutionResidencesRepository extends JpaRepository<InstitutionResidences, Void>, JpaSpecificationExecutor<InstitutionResidences> {

}