package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceFixtures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceFixturesRepository extends JpaRepository<ResidenceFixtures, Integer>, JpaSpecificationExecutor<ResidenceFixtures> {

}