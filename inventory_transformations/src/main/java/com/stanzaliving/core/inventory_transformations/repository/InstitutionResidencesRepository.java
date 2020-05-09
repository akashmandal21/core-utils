package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InstitutionResidencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InstitutionResidencesRepository extends JpaRepository<InstitutionResidencesEntity, Void>, JpaSpecificationExecutor<InstitutionResidencesEntity> {

}