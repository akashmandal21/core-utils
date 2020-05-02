package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentPrimaryGuardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentPrimaryGuardianRepository extends JpaRepository<StudentPrimaryGuardian, String>, JpaSpecificationExecutor<StudentPrimaryGuardian> {

}