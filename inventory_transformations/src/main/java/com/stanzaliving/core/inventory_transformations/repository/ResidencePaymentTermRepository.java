package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidencePaymentTermEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidencePaymentTermRepository extends JpaRepository<ResidencePaymentTermEntity, Integer>, JpaSpecificationExecutor<ResidencePaymentTermEntity> {

}