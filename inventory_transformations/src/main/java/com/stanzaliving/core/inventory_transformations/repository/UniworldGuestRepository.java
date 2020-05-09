package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.UniworldGuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UniworldGuestRepository extends JpaRepository<UniworldGuestEntity, Integer>, JpaSpecificationExecutor<UniworldGuestEntity> {

}