package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BrokerSlabDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BrokerSlabDetailsRepository extends JpaRepository<BrokerSlabDetails, Integer>, JpaSpecificationExecutor<BrokerSlabDetails> {

}