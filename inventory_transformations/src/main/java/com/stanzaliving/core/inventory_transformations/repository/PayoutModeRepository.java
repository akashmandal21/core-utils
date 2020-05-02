package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PayoutMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PayoutModeRepository extends JpaRepository<PayoutMode, Integer>, JpaSpecificationExecutor<PayoutMode> {

}