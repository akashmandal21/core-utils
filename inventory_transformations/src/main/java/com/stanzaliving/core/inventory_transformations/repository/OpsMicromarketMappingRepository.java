package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.OpsMicromarketMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OpsMicromarketMappingRepository extends JpaRepository<OpsMicromarketMapping, Void>, JpaSpecificationExecutor<OpsMicromarketMapping> {

}