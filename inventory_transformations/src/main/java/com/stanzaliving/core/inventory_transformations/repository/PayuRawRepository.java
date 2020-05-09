package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PayuRawEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PayuRawRepository extends JpaRepository<PayuRawEntity, String>, JpaSpecificationExecutor<PayuRawEntity> {

}