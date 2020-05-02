package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PERMISSIONS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PERMISSIONSRepository extends JpaRepository<PERMISSIONS, Integer>, JpaSpecificationExecutor<PERMISSIONS> {

}