package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PayoutModeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface PayoutModeRepository extends JpaRepository<PayoutModeEntity, Integer>, JpaSpecificationExecutor<PayoutModeEntity> {

}