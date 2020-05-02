package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.StudentRoomImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRoomImagesRepository extends JpaRepository<StudentRoomImages, Integer>, JpaSpecificationExecutor<StudentRoomImages> {

}