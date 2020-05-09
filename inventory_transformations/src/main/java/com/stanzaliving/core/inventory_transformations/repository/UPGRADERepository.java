package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.UPGRADEEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UPGRADERepository extends JpaRepository<UPGRADEEntity, Integer>, JpaSpecificationExecutor<UPGRADEEntity> {

}