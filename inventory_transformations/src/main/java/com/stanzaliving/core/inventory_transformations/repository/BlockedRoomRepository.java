package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.BlockedRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BlockedRoomRepository extends JpaRepository<BlockedRoom, Integer>, JpaSpecificationExecutor<BlockedRoom> {

}