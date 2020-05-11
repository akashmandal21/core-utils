package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface COURSERepository extends JpaRepository<CourseEntity, Integer>, JpaSpecificationExecutor<CourseEntity> {

}