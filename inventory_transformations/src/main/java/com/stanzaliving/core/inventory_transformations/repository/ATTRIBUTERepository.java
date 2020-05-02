package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ATTRIBUTE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ATTRIBUTERepository extends JpaRepository<ATTRIBUTE, Integer>, JpaSpecificationExecutor<ATTRIBUTE> {

}