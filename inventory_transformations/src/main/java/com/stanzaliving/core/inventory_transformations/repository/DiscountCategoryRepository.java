package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.DiscountCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DiscountCategoryRepository extends JpaRepository<DiscountCategory, Integer>, JpaSpecificationExecutor<DiscountCategory> {

}