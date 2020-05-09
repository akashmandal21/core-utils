package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentRoomImagesOrigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRoomImagesOrigRepository extends JpaRepository<StudentRoomImagesOrigEntity, Integer>, JpaSpecificationExecutor<StudentRoomImagesOrigEntity> {

}