package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BROKERRepository extends JpaRepository<BrokerEntity, Integer>, JpaSpecificationExecutor<BrokerEntity> {

}