package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.INSTITUTION;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface INSTITUTIONRepository extends JpaRepository<INSTITUTION, Integer>, JpaSpecificationExecutor<INSTITUTION> {

}