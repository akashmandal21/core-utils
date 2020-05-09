package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ResidenceFloorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResidenceFloorsRepository extends JpaRepository<ResidenceFloorsEntity, Void>, JpaSpecificationExecutor<ResidenceFloorsEntity> {

}