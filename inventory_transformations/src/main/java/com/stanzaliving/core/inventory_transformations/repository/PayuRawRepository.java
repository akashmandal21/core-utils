package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PayuRaw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PayuRawRepository extends JpaRepository<PayuRaw, String>, JpaSpecificationExecutor<PayuRaw> {

}