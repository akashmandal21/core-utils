package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.AppVersionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;


public interface AppVersionRepository extends JpaRepository<AppVersionEntity, Integer>, JpaSpecificationExecutor<AppVersionEntity> {

}