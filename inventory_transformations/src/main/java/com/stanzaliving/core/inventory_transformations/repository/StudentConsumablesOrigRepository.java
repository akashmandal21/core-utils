package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentConsumablesOrig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentConsumablesOrigRepository extends JpaRepository<StudentConsumablesOrig, Integer>, JpaSpecificationExecutor<StudentConsumablesOrig> {

}