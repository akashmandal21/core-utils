package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RevenueDeduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RevenueDeductionRepository extends JpaRepository<RevenueDeduction, Integer>, JpaSpecificationExecutor<RevenueDeduction> {

}