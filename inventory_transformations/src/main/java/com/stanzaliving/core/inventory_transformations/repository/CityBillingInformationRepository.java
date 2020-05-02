package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CityBillingInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CityBillingInformationRepository extends JpaRepository<CityBillingInformation, Integer>, JpaSpecificationExecutor<CityBillingInformation> {

}