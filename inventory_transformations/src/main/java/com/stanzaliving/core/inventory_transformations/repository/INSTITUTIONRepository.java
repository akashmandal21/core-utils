package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.InstitutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface INSTITUTIONRepository extends JpaRepository<InstitutionEntity, Integer>, JpaSpecificationExecutor<InstitutionEntity> {

}