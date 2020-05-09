package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentPrimaryGuardianEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentPrimaryGuardianRepository extends JpaRepository<StudentPrimaryGuardianEntity, String>, JpaSpecificationExecutor<StudentPrimaryGuardianEntity> {

}