package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.JOBS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JOBSRepository extends JpaRepository<JOBS, Integer>, JpaSpecificationExecutor<JOBS> {

}