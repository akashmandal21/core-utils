package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceRcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface ResidenceRcRepository extends JpaRepository<ResidenceRcEntity, Integer>, JpaSpecificationExecutor<ResidenceRcEntity> {

}