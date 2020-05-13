package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.RolesPermissionMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface RolesPermissionMappingRepository extends JpaRepository<RolesPermissionMappingEntity, Integer>, JpaSpecificationExecutor<RolesPermissionMappingEntity> {

}