package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RoomChangeDuesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoomChangeDuesRepository extends JpaRepository<RoomChangeDuesEntity, String>, JpaSpecificationExecutor<RoomChangeDuesEntity> {

}