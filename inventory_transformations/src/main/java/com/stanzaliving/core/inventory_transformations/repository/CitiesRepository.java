package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CitiesRepository extends JpaRepository<CitiesEntity, Long>, JpaSpecificationExecutor<CitiesEntity> {

}