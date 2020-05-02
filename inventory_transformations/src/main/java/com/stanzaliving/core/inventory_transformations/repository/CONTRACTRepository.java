package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CONTRACT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CONTRACTRepository extends JpaRepository<CONTRACT, Integer>, JpaSpecificationExecutor<CONTRACT> {

}