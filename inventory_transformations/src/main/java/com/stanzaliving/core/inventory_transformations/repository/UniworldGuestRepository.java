package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.UniworldGuest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UniworldGuestRepository extends JpaRepository<UniworldGuest, Integer>, JpaSpecificationExecutor<UniworldGuest> {

}