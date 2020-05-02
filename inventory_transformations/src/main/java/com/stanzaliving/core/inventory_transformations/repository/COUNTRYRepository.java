package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.COUNTRY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface COUNTRYRepository extends JpaRepository<COUNTRY, Integer>, JpaSpecificationExecutor<COUNTRY> {

}