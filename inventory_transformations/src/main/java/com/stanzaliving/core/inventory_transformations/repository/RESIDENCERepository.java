package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RESIDENCERepository extends JpaRepository<ResidenceEntity, Integer>, JpaSpecificationExecutor<ResidenceEntity> {

}