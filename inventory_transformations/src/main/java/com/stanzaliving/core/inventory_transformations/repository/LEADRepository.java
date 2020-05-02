package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.LEAD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LEADRepository extends JpaRepository<LEAD, Integer>, JpaSpecificationExecutor<LEAD> {

}