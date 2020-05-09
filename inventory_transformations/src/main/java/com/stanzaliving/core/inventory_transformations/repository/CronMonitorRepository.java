package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.CronMonitorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CronMonitorRepository extends JpaRepository<CronMonitorEntity, Integer>, JpaSpecificationExecutor<CronMonitorEntity> {

}