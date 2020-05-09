package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerDocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BrokerDocumentRepository extends JpaRepository<BrokerDocumentEntity, Integer>, JpaSpecificationExecutor<BrokerDocumentEntity> {

}