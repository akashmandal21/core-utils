package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.DEGREE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DEGREERepository extends JpaRepository<DEGREE, Integer>, JpaSpecificationExecutor<DEGREE> {

}