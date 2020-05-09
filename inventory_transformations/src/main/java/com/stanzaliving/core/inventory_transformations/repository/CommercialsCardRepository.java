package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CommercialsCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommercialsCardRepository extends JpaRepository<CommercialsCardEntity, Integer>, JpaSpecificationExecutor<CommercialsCardEntity> {

}