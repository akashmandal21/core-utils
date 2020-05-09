package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentAdditionalContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentAdditionalContactRepository extends JpaRepository<StudentAdditionalContactEntity, String>, JpaSpecificationExecutor<StudentAdditionalContactEntity> {

}