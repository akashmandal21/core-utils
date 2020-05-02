package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.MICROMARKET;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MICROMARKETRepository extends JpaRepository<MICROMARKET, Integer>, JpaSpecificationExecutor<MICROMARKET> {

}