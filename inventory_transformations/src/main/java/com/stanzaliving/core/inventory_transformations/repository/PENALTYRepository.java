package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.PenaltyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PENALTYRepository extends JpaRepository<PenaltyEntity, String>, JpaSpecificationExecutor<PenaltyEntity> {

}