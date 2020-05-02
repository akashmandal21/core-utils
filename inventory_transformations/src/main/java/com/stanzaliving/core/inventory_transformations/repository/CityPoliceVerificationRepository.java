package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CityPoliceVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CityPoliceVerificationRepository extends JpaRepository<CityPoliceVerification, Integer>, JpaSpecificationExecutor<CityPoliceVerification> {

}