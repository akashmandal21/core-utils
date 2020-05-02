package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CityLevelMaxDiscount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CityLevelMaxDiscountRepository extends JpaRepository<CityLevelMaxDiscount, Integer>, JpaSpecificationExecutor<CityLevelMaxDiscount> {

}