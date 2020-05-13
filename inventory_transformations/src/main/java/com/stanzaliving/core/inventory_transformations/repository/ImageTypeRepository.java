package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.ImageTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface ImageTypeRepository extends JpaRepository<ImageTypeEntity, Integer>, JpaSpecificationExecutor<ImageTypeEntity> {

}