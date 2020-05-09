package com.stanzaliving.core.inventory_transformations.repository;

import com.stanzaliving.core.inventory_transformations.entity.TRANSACTIONEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TRANSACTIONRepository extends JpaRepository<TRANSACTIONEntity, Integer>, JpaSpecificationExecutor<TRANSACTIONEntity> {

}