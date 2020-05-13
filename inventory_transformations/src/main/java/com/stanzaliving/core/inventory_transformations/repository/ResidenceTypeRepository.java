package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface ResidenceTypeRepository extends JpaRepository<ResidenceTypeEntity, Integer>, JpaSpecificationExecutor<ResidenceTypeEntity> {

}