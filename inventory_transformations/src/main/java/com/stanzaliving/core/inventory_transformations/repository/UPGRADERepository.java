package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.UpgradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UPGRADERepository extends JpaRepository<UpgradeEntity, Integer>, JpaSpecificationExecutor<UpgradeEntity> {

}