package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentLocalGuardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentLocalGuardianRepository extends JpaRepository<StudentLocalGuardian, String>, JpaSpecificationExecutor<StudentLocalGuardian> {

}