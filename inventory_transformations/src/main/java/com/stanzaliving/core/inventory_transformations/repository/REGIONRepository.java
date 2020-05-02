package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.REGION;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface REGIONRepository extends JpaRepository<REGION, Integer>, JpaSpecificationExecutor<REGION> {

}