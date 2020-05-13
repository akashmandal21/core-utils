package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentWifiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface StudentWifiRepository extends JpaRepository<StudentWifiEntity, Integer>, JpaSpecificationExecutor<StudentWifiEntity> {

}