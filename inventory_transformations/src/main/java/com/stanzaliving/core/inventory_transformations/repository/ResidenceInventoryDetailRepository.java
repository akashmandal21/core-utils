package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceInventoryDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceInventoryDetailRepository extends JpaRepository<ResidenceInventoryDetail, Integer>, JpaSpecificationExecutor<ResidenceInventoryDetail> {

}