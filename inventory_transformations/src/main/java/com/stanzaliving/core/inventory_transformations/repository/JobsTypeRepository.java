package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.JobsTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface JobsTypeRepository extends JpaRepository<JobsTypeEntity, Integer>, JpaSpecificationExecutor<JobsTypeEntity> {

}