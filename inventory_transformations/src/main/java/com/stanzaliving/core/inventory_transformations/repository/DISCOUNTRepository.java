package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.DISCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DISCOUNTRepository extends JpaRepository<DISCOUNT, String>, JpaSpecificationExecutor<DISCOUNT> {

}