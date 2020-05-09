package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BrokerTypeRepository extends JpaRepository<BrokerTypeEntity, Integer>, JpaSpecificationExecutor<BrokerTypeEntity> {

}