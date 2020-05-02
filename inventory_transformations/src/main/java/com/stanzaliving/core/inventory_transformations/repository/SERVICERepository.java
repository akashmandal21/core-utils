package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.SERVICE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SERVICERepository extends JpaRepository<SERVICE, Integer>, JpaSpecificationExecutor<SERVICE> {

}