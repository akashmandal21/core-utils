package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidencePosCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidencePosCodeRepository extends JpaRepository<ResidencePosCode, Integer>, JpaSpecificationExecutor<ResidencePosCode> {

}