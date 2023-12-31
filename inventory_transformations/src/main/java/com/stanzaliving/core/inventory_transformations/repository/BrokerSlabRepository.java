package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerSlabEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface BrokerSlabRepository extends JpaRepository<BrokerSlabEntity, Integer>, JpaSpecificationExecutor<BrokerSlabEntity> {

}