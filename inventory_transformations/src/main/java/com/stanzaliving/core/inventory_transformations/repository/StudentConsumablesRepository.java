package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentConsumables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentConsumablesRepository extends JpaRepository<StudentConsumables, Integer>, JpaSpecificationExecutor<StudentConsumables> {

}