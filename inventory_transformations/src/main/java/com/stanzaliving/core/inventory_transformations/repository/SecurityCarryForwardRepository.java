package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.SecurityCarryForward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SecurityCarryForwardRepository extends JpaRepository<SecurityCarryForward, Integer>, JpaSpecificationExecutor<SecurityCarryForward> {

}