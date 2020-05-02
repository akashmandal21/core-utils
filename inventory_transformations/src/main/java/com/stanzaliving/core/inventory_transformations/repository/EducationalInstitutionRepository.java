package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.EducationalInstitution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EducationalInstitutionRepository extends JpaRepository<EducationalInstitution, Integer>, JpaSpecificationExecutor<EducationalInstitution> {

}