package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RoomAttributeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoomAttributeRepository extends JpaRepository<RoomAttributeEntity, Integer>, JpaSpecificationExecutor<RoomAttributeEntity> {

}